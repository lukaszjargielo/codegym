package pl.codegym.task.task04.task0424;

/* 
Trzy liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());

        if (i1 != i2) {
            if (i2 == i3) {
                System.out.println("1");
            } else if (i1 == i3) {
                System.out.println("2");
            }
        } else if (i1 != i3) {
            System.out.println("3");
        }

    }

}
