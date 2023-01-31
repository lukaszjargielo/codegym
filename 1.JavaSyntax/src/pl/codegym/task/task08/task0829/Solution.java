package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lista adresów
        HashMap<String, String> map = new HashMap<>();
//        List<String> adresy = new ArrayList<>();
        while (true) {
            String keyMiasto = reader.readLine();
            if (keyMiasto.isEmpty()) {
                break;
            }

//            adresy.add(rodzina) ;
            // Wczytuje numer domu
//            int numerDomu = Integer.parseInt(reader.readLine());
            String valueFamily = reader.readLine();
            map.put(keyMiasto,valueFamily);
        }
String family = map.get(reader.readLine());
        System.out.println(family);
//         if (0 <= numerDomu && numerDomu < adresy.size()) {
//            String nazwiskoRodziny = adresy.get(numerDomu);
//            System.out.println(nazwiskoRodziny);
//        }
    }
}
