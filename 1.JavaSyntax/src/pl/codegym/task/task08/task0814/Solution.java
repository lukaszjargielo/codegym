package pl.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet() {
        // tutaj wpisz swój kod
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i * 2);
        }
        return set;
    }

    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        // tutaj wpisz swój kod
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int x = iter.next();
            if (x > 10) {
                iter.remove();

            }
        }
        return set;
    }


    public static void main(String[] args) {

    }
}
