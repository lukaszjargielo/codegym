package pl.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Sprawdzanie kolejności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;

        for(int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i+1).length() >= list.get(i).length()) {
                continue;
            } else {
               System.out.println(i+1);
               break;
            }


        }

    }
}

