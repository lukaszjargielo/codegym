package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();

        //tutaj wpisz swój kod. krok 3
        Iterator<Kot> iterator = koty.iterator();
        koty.remove(iterator.next());

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        //tutaj wpisz swój kod. krok 2
        HashSet<Kot> set = new HashSet<>();
        Kot cat1 = new Kot();
        set.add(cat1);
        Kot cat2 = new Kot();
        set.add(cat2);
        Kot cat3 = new Kot();
        set.add(cat3);
//        set.add(new Kot());
//        set.add(new Kot());
//        set.add(new Kot());
        return set;
    }

    public static void printKoty(Set<Kot> koty) {
        // krok 4
        for (Kot cat : koty) {
            System.out.println(cat);

        }
    }

    // krok 1
    public static class Kot {

        public Kot() {
        }
    }
}
