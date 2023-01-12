package pl.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Zadanie z algorytmami
*/

//class MyComparator implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1 < o2) {
//            return 1;
//        } else if (o1 > o2) {
//            return -1;
//        } else {
//            return 0;
//        }
//
//    }
//}

public class Solution /*extends MyComparator*/ {
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
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<String> listStr = new ArrayList<>();
        for (String s : tablica) {
            if (isLiczba(s)) {
                listInt.add(Integer.parseInt(s));
            } else {
                listStr.add(s);
            }
        }
//            listInt.sort(new MyComparator());
//            Collections.sort(listStr);
        Collections.sort(listInt);
        Collections.reverse(listInt);

        for (int i = 0; i < listStr.size() - 1; i++) {
            for (int j = (listStr.size() - 1); j > i; j--) {
                if (!isWiekszeOd(listStr.get(j), listStr.get(j - 1))) {
                    Collections.swap(listStr, j, j - 1);
                }
            }
        }
        String[] tablicaKopia = new String[tablica.length];
        int i = 0;
        int j = 0;
        for (String s : tablica) {
            if (isLiczba(s)) {
                tablicaKopia[i] = String.valueOf(listInt.get(i));
                if (i < listInt.size() - 1) {
                    i++;
                }
            } else {
                tablicaKopia[j] = listStr.get(j);
                if (j < listStr.size() - 1) {
                    j++;
                }
            }
        }
        tablica = tablicaKopia;

        for (String s : tablica) {
            System.out.println(s);
        }
        System.out.println("---------------");

        for (String s : tablicaKopia) {
            System.out.println(s);
        }

    }
//    public static boolean isMniejszeOd(Integer a, Integer b) {
//
//        return a.compareTo(b) < 0;
//    }

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
