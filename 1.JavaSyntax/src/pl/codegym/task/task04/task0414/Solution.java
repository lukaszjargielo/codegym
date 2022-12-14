package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int daysInYear;
        if (year % 4 == 0 & year%100 != 0) {
            daysInYear = 366;
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                daysInYear = 366;
            } else {
                daysInYear = 365;
            }


        } else {
            daysInYear = 365;
        }
        System.out.println("Liczba dni w roku: " + daysInYear);
    }
}