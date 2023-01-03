 package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Kowalski", 400);
        map.put("Machulec", 500);
        map.put("Hensel", 600);
        map.put("Żyłowski", 300);
        map.put("Mirecka", 700);
        map.put("Buchcik", 200);
        map.put("Biela", 800);
        map.put("Pawłowska", 900);
        map.put("Miller", 100);
        map.put("Kaproń", 1_000);
        return map;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
        //tutaj wpisz swój
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> pair = iter.next();
            if(pair.getValue() < 500) {
                iter.remove();
            }
        }

    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = Solution.utworzMap();
//
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
//        }
//
//        System.out.println();
//        Solution.usunPozycjeZmap(map);
//
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
//        }
    }
}