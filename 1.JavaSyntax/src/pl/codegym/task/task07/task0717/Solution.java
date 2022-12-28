package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Czyta ciągi z konsoli i deklaruje tutaj ArrayList
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);

        }
        ArrayList<String> wynik = doubleValues(list);

        // Wyświetla wynik
        for (String s : wynik) {
            System.out.println(s);

        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        //tutaj wpisz swój kod
        Iterator<String> iter = lista.iterator();
        ArrayList<String> list = new ArrayList<>();
//        int counter = 0;
        while (iter.hasNext()) {
            String s = iter.next();
            list.add(s);
            list.add(s);
//            counter++;
//        for (int i = 0; i < lista.size() - 2; i++ ) {
//            String s = lista.get(i);
//            lista.add(i, s);
        }
        return list;
    }
}
