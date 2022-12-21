package pl.codegym.task.task05.task0530;

import java.io.*;

/* 
Szefie, mam tu coś dziwnego...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int suma = a + b;
        System.out.println("Suma = " + suma);
    }
}
