package pl.codegym.task.task04.task0417;

/* 
Masz parę?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 == num2) {
            if (num1 == num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num2);
            }
        } else if (num1 == num3) {
            System.out.println(num1 + " " + num3);
        } else if (num2 == num3) {
            System.out.println(num2 + " " + num3);
        }


    }
}