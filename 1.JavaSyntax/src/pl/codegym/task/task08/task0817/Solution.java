package pl.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, String> surnameAndNameMap = new HashMap<>();
        surnameAndNameMap.put("Kowalski", "Jacek");
        surnameAndNameMap.put("Placek", "Jacek");
        surnameAndNameMap.put("Żyłowski", "Wiesław");
        surnameAndNameMap.put("Machulec", "Andrzej");
        surnameAndNameMap.put("Biela", "Piotr");
        surnameAndNameMap.put("Pukowiec", "Robert");
        surnameAndNameMap.put("Ratajczak", "Robert");
        surnameAndNameMap.put("Fiut", "Jerzy");
        surnameAndNameMap.put("Cipa", "Henryk");
        surnameAndNameMap.put("Grzegorzyca", "Henryk");
        return surnameAndNameMap;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        //tutaj wpisz swój kod
        HashMap<String,String> mapCopy = new HashMap<>(mapa);
        Iterator<Map.Entry<String, String>> iter = mapCopy.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> pair = iter.next();
            String template =  pair.getValue();
            int counter = 0;
        for (String name : mapCopy.values()) {
            if(name.equals(template)) {
                counter++;
                if (counter > 1) {
                    usunElementZMapPoWartosci(mapa, name);
                    counter = 0;
                }
            }

        }
        }

    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc)) {
                mapa.remove(para.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String,String> map = Solution.utworzMap();
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println(pair);
//        }
//        System.out.println();
//        Solution.usunPowtorzoneImiona(map);
//
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println(pair);
//        }
    }
}
