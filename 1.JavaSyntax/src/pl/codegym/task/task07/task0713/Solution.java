package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Granie w Javarellę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        ArrayList<Integer> listDivBy3 = new ArrayList<>();
        ArrayList<Integer> listDivBy2 = new ArrayList<>();
        ArrayList<Integer> listRemain = new ArrayList<>();


        for (int x : list) {
            if (x % 3 == 0) {
                listDivBy3.add(x);
            }
            if (x % 2 == 0) {
                listDivBy2.add(x);
            }
            if (x % 2 !=0 && x % 3 != 0) {
                listRemain.add(x);
            }

        }

        printLista(listDivBy3);
        System.out.println();
        printLista(listDivBy2);
        System.out.println();
        printLista(listRemain);


    }

    public static void printLista(List<Integer> lista) {
        //tutaj wpisz swój kod
        for (int x : lista) {
            System.out.println(x);

        }
    }
}
