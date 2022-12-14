package pl.codegym.task.task04.task0415;

/* 
Zasada trójkąta
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if((a + b > c) & (b + c > a) & (a + c > b)) {
            System.out.println("Da się zbudować trójkąt.");
        }else {
            System.out.println("Nie da się zbudować trójkąta.");

        }
    }
}