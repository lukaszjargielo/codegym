package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Mów zwięźle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        int minLength = list.get(0).length();

        for (String s : list) {
            if (s.length() < minLength) {
                minLength = s.length();
            }

        }

        for (String s : list) {
            if(s.length() == minLength) {
                System.out.println(s);
            }

        }
    }
}
