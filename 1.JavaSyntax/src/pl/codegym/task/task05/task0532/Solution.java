package pl.codegym.task.task05.task0532;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(new MyComparator());
        int maksimum = 0;

        //tutaj wpisz swój kod
        while (true) {
            int counter = Integer.parseInt(reader.readLine());
            if (counter > 0) {
                while (counter != 0) {
                    int number = Integer.parseInt(reader.readLine());
                    queue.add(number);
                    counter--;
                }
                maksimum = queue.element();
                System.out.println(maksimum);
            }
            break;
        }

    }

    public static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 == o2)
                return 0;
            else if (o1 < o2)
                return 1;
            else
                return -1;
        }
    }
}
