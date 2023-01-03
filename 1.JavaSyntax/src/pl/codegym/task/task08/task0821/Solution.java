package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzMapLudzi();
        printMapLudzi(mapa);
    }

    public static Map<String, String> utworzMapLudzi() {
        //tutaj wpisz swój kod
        HashMap<String, String> map = new HashMap<>();
        map.put("Machulec", "Andrzej");
        map.put("Machulec", "Sebastian");
        map.put("Machulec", "Daria");
        map.put("Biela", "Andrzej");
        map.put("Hensel", "Andrzej");
        map.put("Żyłowski", "Wiesław");
        map.put("Kowalski", "Jacek");
        map.put("Kowalski", "Michał");
        map.put("Pawłowska", "Sylwia");
        map.put("Buchcik", "Elżbieta");


        return map;
    }

    public static void printMapLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
