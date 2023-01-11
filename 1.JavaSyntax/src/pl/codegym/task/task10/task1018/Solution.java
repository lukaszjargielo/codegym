package pl.codegym.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Korekta potrzebna natychmiast
*/

public class Solution {
    HashMap<Integer, String> mapa;
    static Integer indeks;
    static String imie;

    public Solution() {
        this.mapa = new HashMap<Integer, String>();
//        mapa.put(indeks, imie);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int indeks = Integer.parseInt(reader.readLine());
            String imie = reader.readLine();
            solution.mapa.put(indeks, imie);
        }

        for (Map.Entry<Integer, String> para : solution.mapa.entrySet()) {
            indeks = para.getKey();
            imie = para.getValue();
            System.out.println("Id=" + indeks + " Imię=" + imie);
        }
    }
}