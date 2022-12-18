package pl.codegym.task.task04.task0439;

/* 
Łańcuszek
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " mnie kocha.");
        }

    }
}
