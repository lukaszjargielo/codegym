package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sum += number;
            if (number == -1)
            break;
        }
        System.out.println(sum);
    }
}
