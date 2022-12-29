package pl.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
W kolejności malejącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        for (int x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(int[] tablica) {
        //tutaj wpisz swój kod
        int[] temp = new int[tablica.length];
        Arrays.sort(tablica);
        for (int i = tablica.length - 1; i >= 0; i--) {
            temp[19 - i] = tablica[i];
        }
        for(int i = 0; i < temp.length; i ++) {
            tablica[i] = temp[i];
        }
        //tablica = Arrays.copyOf(temp, temp.length);
//       int[] tablica2 = Arrays.copyOfRange(tablica,19,0);

//        tablica = tablica2;
//        for (int i = tablica.length; i > 0; i--) {
//            for (int j = 0; i > j; j++) {
//                int temp;
//                if(tablica[])
//            }
//        }
    }
}
