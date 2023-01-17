package pl.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ruszamy na cały kraj
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //tutaj wpisz swój kod

        char[] arr = s.toCharArray();
        char[] newArr = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if ((arr[i] != ' ') /*&& (arr[i] >= 97) && (arr[i] <= 122)*/) {
                    newArr[i] = Character.toUpperCase(arr[i]);
                    continue;
                } else {
                    newArr[i] = arr[i];
                    continue;
                }
            }
            if ((arr[i - 1] == ' ') && (arr[i] != ' ') /*&& (arr[i] >= 97) && (arr[i] <= 122)*/) {
                newArr[i] = Character.toUpperCase(arr[i]);
            } else {
                newArr[i] = arr[i];
            }

        }

        System.out.println(String.valueOf(newArr));
    }
}
