package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] arrBig = new int[20];
        int[] arrSmall1 = new int[10];
        int[] arrSmall2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrBig.length; i++) {
            arrBig[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arrBig.length; i++) {
            if(i <= 9) {
                arrSmall1[i] = arrBig[i];
            } else {
                arrSmall2[i-10] = arrBig[i];

            }
        }

        for (int x : arrSmall2) {
            System.out.println(x);

        }
    }
}
