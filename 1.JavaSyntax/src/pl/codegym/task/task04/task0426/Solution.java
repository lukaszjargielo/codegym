package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num < 0) {
            System.out.print("Ujemna");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.print("Dodatnia");
        }

        if(num % 2 == 0 && num != 0) {
            System.out.println(" liczba parzysta");
        } else if (num % 2 != 0 && num != 0){
            System.out.println(" liczba nieparzysta");
        }
    }
}
