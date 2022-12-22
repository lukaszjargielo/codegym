package pl.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maksimum w tablicy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] tablica = inicjalizujTablice();
        int max = max(tablica);
        System.out.println(max);
    }

    public static int[] inicjalizujTablice() throws IOException {
        // Tworzy i zapełnia tablicę
        int table[] =  new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < table.length; i++) {
            table[i] = Integer.parseInt(reader.readLine());
        }
        return table;
    }

    public static int max(int[] tablica) {
        // Znajduje maksimum
        int max = tablica[0];
        for (int x: tablica) {
            if (x > max) {
                max = x;
            }

        }
        return max;
    }
}
