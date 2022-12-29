package pl.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Koniec
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //tutaj wpisz swój kod

        ArrayList<String> list = new ArrayList<>();
        String s = reader.readLine();
        while(!s.equals("koniec")) {
            list.add(s);
            s = reader.readLine();
        }

        for (String str : list) {
            System.out.println(str);

        }
    }
}