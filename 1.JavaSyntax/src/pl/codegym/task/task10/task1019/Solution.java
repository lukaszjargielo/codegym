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

            System.out.println("Podaj liczbę");
            String input = reader.readLine();
            if (input.isEmpty()) {
                break;
            }

            id = Integer.parseInt(input);
            System.out.println("Podaj imię");
            imie = reader.readLine();

            if (!list.contains(imie)) {
                list.add(imie);
                mapa.put(imie, id);
            } else {
                String imie2 = imie;
                while (imie.equals(imie2) || list.contains(imie2)) {
                    System.out.println("Wprowadź inne imię:");
                    imie2 = reader.readLine();
                }
                list.add(imie2);
                mapa.put(imie2, id);

            }

        }

        for (Map.Entry<String, Integer> pair : mapa.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}