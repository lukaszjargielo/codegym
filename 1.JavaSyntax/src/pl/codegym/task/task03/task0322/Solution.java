package pl.codegym.task.task03.task0322;


/* 
Głęboka i czysta miłość
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String s1 = " + ";
        String s2 = " = Czysta miłość. Ooo la la!";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1 + s1 + name2 + s1 + name3 + s2);

    }
}