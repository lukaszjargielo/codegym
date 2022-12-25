package pl.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Więcej Ala ma kota
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        //tutaj wpisz swój kod
        ArrayList<String> list = new ArrayList<>();
        String[] arr =  {"Ala", "ma", "kota"};
        String s = "As";

        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            list.add(s);
        }

        for (String a : list) {
            System.out.println(a);


        }


    }
}
