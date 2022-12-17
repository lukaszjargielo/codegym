package pl.codegym.task.task04.task0428;

/* 
Liczba dodatnia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int count = 0;

        if (num1 > 0)
            count++;
        if (num2 > 0)
            count++;
        if (num3 > 0)
            count++;

        System.out.println(count);

    }
}
