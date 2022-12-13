package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        HashMap<String, Zerg> zergPopulation = new HashMap<>();
        HashMap<String, Protoss> protossPopulation = new HashMap<>();
        HashMap<String, Terranin> terraninPopulation = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            zergPopulation.put("zerg" + i, new Zerg());
        }
        for (int i = 0; i < 3; i++) {
            protossPopulation.put("protos" + i, new Protoss());
        }
        for (int i = 0; i < 4; i++) {
            terraninPopulation.put("terranin" + i, new Terranin());
        }

        int i = 0;
        for (Map.Entry<String, Zerg> entryZ : zergPopulation.entrySet()) {
            entryZ.getValue().imie = "Zerg " + i;
            i++;
        }
        i = 0;
        for (Map.Entry<String, Protoss> entryP : protossPopulation.entrySet()) {
            entryP.getValue().imie = "Protoss " + i;
            i++;
        }
        i = 0;
        for (Map.Entry<String, Terranin> entryT : terraninPopulation.entrySet()) {
            entryT.getValue().imie = "Terranin " + i;
            i++;
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
