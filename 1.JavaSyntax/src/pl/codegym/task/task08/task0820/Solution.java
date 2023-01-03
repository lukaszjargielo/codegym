package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> wynik = new HashSet<Kot>();

        //tutaj wpisz swój kod
        Kot kot1 = new Kot();
        wynik.add(kot1);
        Kot kot2 = new Kot();
        wynik.add(kot2);
        Kot kot3 = new Kot();
        wynik.add(kot3);
        Kot kot4 = new Kot();
        wynik.add(kot4);

        return wynik;
    }

    public static Set<Pies> utworzPsy() {
        //tutaj wpisz swój kod

        HashSet<Pies> psiSet = new HashSet<>();

        Pies pies1 = new Pies();
        psiSet.add(pies1);
        Pies pies2 = new Pies();
        psiSet.add(pies2);
        Pies pies3 = new Pies();
        psiSet.add(pies3);

        return psiSet;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        //tutaj wpisz swój kod
        HashSet<Object> polaczonySet = new HashSet<>();

        polaczonySet.addAll(koty);
        polaczonySet.addAll(psy);

        return polaczonySet;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        //tutaj wpisz swój kod
        Iterator<Object> iter1 = zwierzeta.iterator();
        Iterator<Kot> iter2  = koty.iterator();
        while (iter2.hasNext()){
            Kot kot = iter2.next();
            while (iter1.hasNext()){
                Object o = iter1.next();
                if(o instanceof Kot) {
                    iter1.remove();
                }
            }



        }
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        //tutaj wpisz swój kod
        for (Object o : zwierzeta) {
            System.out.println(o);

        }
    }

    //tutaj wpisz swój kod
    public static class Kot {
        public Kot() {
        }


    }

    public static class Pies {
        public Pies() {
        }
    }
}
