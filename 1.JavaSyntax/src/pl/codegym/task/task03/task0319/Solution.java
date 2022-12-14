package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String s1 = " dostanie ";
        String s2 = " za ";
        String s3 = " lat.";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int salary = Integer.parseInt(reader.readLine());
        int workExperience = Integer.parseInt(reader.readLine());
        System.out.println(name + s1 + salary + s2 + workExperience + s3);
    }
}
