package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        String fileName = reader.readLine();
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        reader = new BufferedReader(new InputStreamReader(fis));

        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            Integer x = Integer.parseInt(inputLine);
            list.add(x);

        }

        Collections.sort(list);

        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }


        reader.close();
        fis.close();

    }
}
