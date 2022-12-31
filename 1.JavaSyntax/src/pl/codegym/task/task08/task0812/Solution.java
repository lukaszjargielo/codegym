package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Najdłuższa sekwencja
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);

        }
        int sequenceCounter = 1;
        int counter = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i+1).equals(list.get(i))) {
                counter++;
                if(counter > sequenceCounter) {
                    sequenceCounter = counter;
                }
            } else {
                counter = 1;
            }

        }

        System.out.println(sequenceCounter);



    }
}
