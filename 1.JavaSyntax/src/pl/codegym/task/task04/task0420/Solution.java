package pl.codegym.task.task04.task0420;

/* 
Sortowanie trzech liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num0 = Integer.parseInt(reader.readLine());
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());


        int tab[] = {num0, num1, num2};

        int temp;
        int size = tab.length;

        for (int i = 0; i < tab.length -1; i++) {

            for (int j = size - 1; j > i; j--) {

                if (tab[j] > tab[j - 1]) {

                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }

        for (int x : tab) {
            System.out.print(x + " ");

        }
    }
}

