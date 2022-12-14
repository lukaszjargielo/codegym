package pl.codegym.task.task03.task0325;

import java.io.*;

/* 
Oczekiwania finansowe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String s1 = "Zarobię ";
        String s2 = " zł na godzinę";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bid = Integer.parseInt(reader.readLine());
        System.out.println(s1 + bid + s2);
    }
}
