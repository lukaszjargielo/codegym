package pl.codegym.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Funkcjonalność to nie wszystko!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> mapa = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int id = 0;
        String imie = "";

        while (true) {
            try {
                String input = reader.readLine();
                if (input.isEmpty()) {
//                if (imie.isEmpty()) {
//                    mapa.put("null",id);
                break;
            }
//              System.out.println("Podaj liczbę");
//            id = Integer.parseInt(reader.readLine());
                id = Integer.parseInt(input);
//              System.out.println("Podaj imię");
                imie = reader.readLine();

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            if (!list.contains(imie)) {
                list.add(imie);
                mapa.put(imie, id);
//            } else {
//                String imie2 = imie;
//                while (imie.equals(imie2) || list.contains(imie2) ) {
//                    System.out.println("Wprowadź inne imię:");
//                    imie2 = reader.readLine();
            }
//                list.add(imie2);
//                mapa.put(imie2, id);

//            }



//        System.out.println("Id=" + id + " Imię=" + imie);
        }
        for (Map.Entry<String, Integer> pair : mapa.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
//            System.out.println(pair.getKey() + " " + pair.getValue());

        }
    }
}