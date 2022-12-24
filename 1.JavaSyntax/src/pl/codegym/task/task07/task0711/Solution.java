package pl.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Usuń i wstaw
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < 13; i++) {
            String s = list.remove(list.size() - 1);
            list.add(0, s);
        }

        for (String s : list) {
            System.out.println(s);

        }
    }
}
