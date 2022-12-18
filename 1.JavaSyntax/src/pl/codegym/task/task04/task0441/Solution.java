package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int arr[] = {num1, num2, num3};
        int temp;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }


        }

//        for (int x : arr) {
//            System.out.print(x + " ");

//        }
//        System.out.println();
        System.out.println(arr[1]);
    }
}
