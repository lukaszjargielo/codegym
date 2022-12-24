package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Ulice i domy
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] arr = new int[15];
        int sumEven = 0;
        int sumOdd = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }

        if(sumEven > sumOdd) {
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
        } else if (sumEven < sumOdd)  {
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
        }
    }
}
