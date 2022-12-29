package pl.codegym.task.task08.task0804;

import java.util.HashMap;
import java.util.Map;

/* 
Wyświetl listę kluczy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("Sim", "Sim");
        mapa.put("Tom", "Tom");
        mapa.put("Arbus", "Arbus");
        mapa.put("Dzieciak", "Dzieciak");
        mapa.put("Kot", "Kot");
        mapa.put("Pies", "Pies");
        mapa.put("Je", "Je");
        mapa.put("Jedzonko", "Jedzonko");
        mapa.put("Gevey", "Gevey");
        mapa.put("Przytulas", "Przytulas");

        printKlucze(mapa);
    }

    public static void printKlucze(Map<String, String> map) {
        //tutaj wpisz swój kod
        for (Map.Entry<String,String> para : map.entrySet()) {
            String key = para.getKey();
            System.out.println(key);

        }
    }
}
