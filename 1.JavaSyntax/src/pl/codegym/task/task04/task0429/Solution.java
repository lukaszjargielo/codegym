package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int posCount = 0;
        int negCount = 0;

        if (num1 > 0) {
            posCount++;
        } else if (num1 < 0) {
            negCount++;
        }

        if (num2 > 0) {
            posCount++;
        } else if (num2 < 0) {
            negCount++;
        }

        if (num3 > 0) {
            posCount++;
        } else if (num3 < 0) {
            negCount++;
        }

        System.out.println("Liczba liczb ujemnych: " + negCount);
        System.out.println("Liczba liczb dodatnich: " + posCount);
    }
}
