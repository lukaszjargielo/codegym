package pl.codegym.task.task03.task0320;


/* 
Skromny programista
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String s1 = " zarabia 120 000 zł na rok. Ha ha ha!";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name + s1);
    }
}
