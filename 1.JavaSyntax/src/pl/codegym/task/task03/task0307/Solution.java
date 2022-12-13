package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        HashMap<String, Zerg> zergPopulation = new HashMap<>();
        HashMap<String, Zerg> protossPopulation = new HashMap<>();
        HashMap<String, Zerg> terraninPopulation = new HashMap<>();

        for(int i = 0; i < 5; i++) {
            zergPopulation.put("zerg" + i, new Zerg());
            protossPopulation.put("protos" + i, new Zerg());
            terraninPopulation.put("terranin" + i, new Zerg());
        }
    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
