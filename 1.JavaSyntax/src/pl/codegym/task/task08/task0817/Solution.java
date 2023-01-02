package pl.codegym.task.task08.task0817;

import java.util.*;

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
        HashMap<String, String> mapCopy = new HashMap<>(mapa);

        System.out.println(mapCopy.values());
//        Collections.sort(mapCopy.values());


//        for (Map.Entry<String, String> para : mapa.entrySet()) {
//            String name = para.getValue()
//            mapa.containsValue()


        }











//    HashMap<String,String> mapCopy = new HashMap<>(mapa);
//    Iterator<Map.Entry<String, String>> iterator = mapa.entrySet().iterator();
//        for (Map.Entry<String, String> para : mapCopy.entrySet()) {
//        String name = para.getValue();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> pair = iterator.next();
//            String theSameName = pair.getValue();
//            if(name.contains(theSameName)) {
//                iterator.remove();
//
//
//            }
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//

//
//
//        HashMap<String,String> mapCopy = new HashMap<>(mapa);
//        Iterator<Map.Entry<String, String>> iterator = mapa.entrySet().iterator();

//        while (iterator.hasNext()) {
//            Map.Entry<String, String> pair1 = iterator.next();
//            String name = pair1.getValue();
//            for (Map.Entry<String, String> pair2 : mapCopy.entrySet()){
//                if(pair2.getValue().contains(name)) {
//                    mapa.remove(pair2.getKey());
//            }
//
//
//
//            }
//
//        }


  //  }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc)) {
                mapa.remove(para.getKey());
            }
        }
    }

    public static void main(String[] args) {
            HashMap<String, String> map = Solution.utworzMap();
            Solution.usunPowtorzoneImiona(map);
        System.out.println(map);
    }
}
