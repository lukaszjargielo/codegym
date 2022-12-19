package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double result = 0.0;
        double sum = 0.0;
        int counter = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                System.out.println(result);
                break;
            }
            counter ++;
            sum += number;
            result = sum / counter;
        }
    }
}

