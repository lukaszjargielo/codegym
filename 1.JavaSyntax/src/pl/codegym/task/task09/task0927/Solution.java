package pl.codegym.task.task09.task0927;

import java.util.*;

/* 
Dziesięć kotów
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, Kot> mapaKotow = new HashMap<>();
        mapaKotow.put("Stefan", new Kot("Stefan"));
        mapaKotow.put("Rysio", new Kot("Rysio"));
        mapaKotow.put("Filemon", new Kot("Filemon"));
        mapaKotow.put("Bonifacy", new Kot("Bonifacy"));
        mapaKotow.put("Wrocek", new Kot("Wrocek"));
        mapaKotow.put("Klara", new Kot("Klara"));
        mapaKotow.put("Litchi", new Kot("Litchi"));
        mapaKotow.put("Mango", new Kot("Mango"));
        mapaKotow.put("Melon", new Kot("Melon"));
        mapaKotow.put("Hunter", new Kot("Hunter"));
        return mapaKotow;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
        //tutaj wpisz swój kod
       Collection<Kot> col = mapa.values();
       HashSet<Kot> set = new HashSet<>(col);
       return set;
    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {

            this.imie = imie;
        }

        public String toString() {

            return "Kot " + this.imie;
        }
    }


}
