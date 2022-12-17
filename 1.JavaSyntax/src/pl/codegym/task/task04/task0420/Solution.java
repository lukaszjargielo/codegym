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
        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length - 1; j++) {
                int buf;
                if (tab[j++] > tab[j]) {
                    buf = tab[j];
                    tab[j] = tab[j++];
                    tab[j++] = tab[j];
                }
            }
        }
            for (int x : tab) {
                System.out.print(x + " ");

            }
        }
    }

