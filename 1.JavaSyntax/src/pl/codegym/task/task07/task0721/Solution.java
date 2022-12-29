package pl.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maksimum;
        int minimum;

        //tutaj wpisz swój kod

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(numbers);

        minimum = numbers[0];
        maksimum = numbers[numbers.length-1];

        System.out.print(maksimum + " " + minimum);
    }
}
