package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String[] arr1 = new String[10];
        int arr2[] = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = reader.readLine();
            arr2[i] = arr1[i].length();
        }

        for (int x : arr2) {
            System.out.println(x);
        }
    }
}
