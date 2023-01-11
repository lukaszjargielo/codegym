package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Liczba liter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alfabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

//        for (char c : alfabet) {
//            System.out.println(c);
//        }
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < alfabet.size(); i++) {
//            map.put(alfabet.get(i), 0);
//        }
//
//        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue() );
//
//        }

        // Czyta ciągi
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }

        // tutaj wpisz swój kod

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alfabet.size(); i++) {
            map.put(alfabet.get(i), 0);
        }

//        for (Map.Entry<Character, Integer> pair : map1.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue() );
//
//        }

        for (String s : lista) {
            char[] array = s.toCharArray();
            for (char c1 : alfabet) {
                int count = 0;
                for (char c2 : array) {
                    if (c1 == c2) {
                        count++;
                    }
                }
                int mapValueForChar = map.get(c1);
                map.replace(c1, mapValueForChar += count);

            }
        }
        for (char l : alfabet) {
            System.out.println(l + " " + map.get(l));


        }
    }

}
