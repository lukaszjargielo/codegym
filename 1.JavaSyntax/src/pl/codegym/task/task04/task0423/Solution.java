package pl.codegym.task.task04.task0423;

/* 
Strategia ochroniarzy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age > 20) {
            System.out.println("Wystarczy, że masz 18");
        }
    }
}
