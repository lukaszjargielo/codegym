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
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        System.out.println(name + s1 + year + s2);
        scanner.close();
    }
}
