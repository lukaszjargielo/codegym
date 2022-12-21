package pl.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Poprawianie funkcjonalności
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

//        int minimum1 = min(a, b);
//        int minimum2 = min(c, d);
//        int minimum3 = min(minimum1, minimum2);
        int minimum = min(a, b, c, d, e);



        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {
        int min1 = a < b ? a : b;
        int min2 = c < d ? c : d;
        int min3 = min1 < min2 ? min1 : min2;
        return min3 < e ? min3 : e;
//        int minimum1 = min(a, b);
//        int minimum2 = min(c, d);
//        int minimum3 = min(minimum1, minimum2);
//        int minimum = min(minimum3, e);
//        return a < b ? a : b;
    }
}
