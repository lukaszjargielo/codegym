package pl.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            lista.add(s);
        }

        String[] tablica = lista.toArray(new String[lista.size()]);
        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        // tutaj wpisz swój kod

        String[] tablicaCopy = new String[tablica.length];
        tablicaCopy = tablica;
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (String s : tablica) {
            if (isLiczba(s)) {
                integerArrayList.add(Integer.parseInt(s));
            } else {
                stringArrayList.add(s);
            }
        }
        for (int i = 0; i < stringArrayList.size() - 1; i++) {
            for (int j = stringArrayList.size() - 1; j > i; j--) {
                String a = stringArrayList.get(j-1);
                String b = stringArrayList.get(j);
                if (isWiekszeOd(a, b)) {

                    Collections.swap(stringArrayList, j, j - 1);
                }
            }
        }
        Collections.sort(integerArrayList);
        Collections.reverse(integerArrayList);

        int intCount = 0;
        int strCount = 0;
        for (int i = 0; i < tablica.length - 1; i++) {
            if (isLiczba(tablica[i])) {
                tablicaCopy[i] = String.valueOf(integerArrayList.get(intCount++));
            } else {
                tablicaCopy[i] = stringArrayList.get(strCount++);
            }

            tablica = tablicaCopy;
        }

    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {

        return a.compareTo(b) > 0;
    }


    // Czy przekazywany ciąg jest liczbą?
    public static boolean isLiczba(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i != 0 && c == '-') { // Ciąg zawiera łącznik
                return false;
            }
            if (!Character.isDigit(c) && c != '-') { // lub nie jest liczbą i nie zaczyna się łącznikiem
                return false;
            }
            if (i == 0 && c == '-' && chars.length == 1) { // lub jest pojedynczym łącznikiem
                return false;
            }
        }
        return true;
    }
}
