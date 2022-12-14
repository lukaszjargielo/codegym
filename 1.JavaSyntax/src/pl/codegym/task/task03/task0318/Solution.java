package pl.codegym.task.task03.task0318;

/* 
Plan podboju świata
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String s1 = " przejmie władzę nad światem za ";
        String s2 = " lat. Mua ha ha!";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Wprowadź liczbę:");
        int year = Integer.parseInt(reader.readLine());
//        System.out.println("Wprowadź imię:");
        String name = reader.readLine();
        System.out.println(name + s1 + year + s2);

    }
}
