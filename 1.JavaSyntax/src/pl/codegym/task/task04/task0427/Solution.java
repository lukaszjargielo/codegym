package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0 && number < 1000) {
            if (number % 2 == 0) {
                System.out.print("parzysta ");
            } else {
                System.out.print("nieparzysta ");
            }
        }
        String num = Integer.toString(number);
        if(number != 0) {
            switch (num.length()) {
                case 1:
                    System.out.println("liczba jednocyfrowa");
                    break;

                case 2:
                    System.out.println("liczba dwucyfrowa");
                    break;

                case 3:
                    System.out.println("liczba trzycyfrowa");
                    break;
            }
        }
    }
}
