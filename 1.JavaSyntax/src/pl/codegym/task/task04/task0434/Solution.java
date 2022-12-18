package pl.codegym.task.task04.task0434;


/* 
Tabliczka mnożenia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int i = 1;
        int row = 1;

        while(row < 11) {
            System.out.print(i * row + " ");
            i++;
            if (i == 10) {
                System.out.print(i * row + " ");
                System.out.println();
                i = 1;
                row++;
            }
        }

    }
}
