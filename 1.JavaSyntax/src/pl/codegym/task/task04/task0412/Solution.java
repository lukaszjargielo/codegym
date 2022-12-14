package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if(number > 0) {
            number *=2;
            System.out.println(number);
        } else if (number < 0) {
            number++;
            System.out.println(number);
        } else {
            System.out.println(number);
        }

    }

}