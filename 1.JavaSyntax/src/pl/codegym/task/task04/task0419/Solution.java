package pl.codegym.task.task04.task0419;

/* 
Największa z czterech liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        int max1 = Math.max(num1,num2);
        int max2 = Math.max(num3,num4);
        int maxResult = Math.max(max1,max2);

        System.out.println(maxResult);
    }
}
