package pl.codegym.task.task04.task0421;

/* 
Jola czy Jola?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2)) {
            System.out.println("Imiona są identyczne");
        } else if (name1.length() == name2.length()) {
            System.out.println("Imiona są takiej samej długości");
        }



    }
}
