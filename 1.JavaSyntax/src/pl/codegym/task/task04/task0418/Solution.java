package pl.codegym.task.task04.task0418;

/* 
Mniejsza z dwóch liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 <= num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}