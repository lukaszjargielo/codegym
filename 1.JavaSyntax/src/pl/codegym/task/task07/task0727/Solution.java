package pl.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zmiana funkcjonalności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        ArrayList<String> lista2 = new ArrayList<>();
        for (String s : lista) {
            char[] letters = s.toCharArray();
            if (letters.length % 2 == 0) {
                    lista2.add(s + " " + s);

            } else {
                lista2.add(s + " " + s + " " + s);

            }

        }

        for (String s : lista2) {
            System.out.println(s);

        }

//        ArrayList<String> listaWielkimiLiterami = new ArrayList<String>();
//        for (int i = 0; i < lista.size(); i++) {
//            String s = lista.get(i);
//            listaWielkimiLiterami.add(s.toUpperCase());
//        }
//
//        for (int i = 0; i < listaWielkimiLiterami.size(); i++) {
//            System.out.println(listaWielkimiLiterami.get(i));
//        }
    }
}
