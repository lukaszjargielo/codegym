package pl.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
Lista tablic z liczbami
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> lista = utworzLista();
        printLista(lista);
    }

    public static ArrayList<int[]> utworzLista() {
        //tutaj wpisz swój kod
        ArrayList<int[]> list = new ArrayList<>();
        int[] array1 = {1, 2, 3, 4, 5};
        list.add(array1);
        int[] array2 = {1, 2};
        list.add(array2);
        int[] array3 = {1, 2, 3, 4};
        list.add(array3);
        int[] array4 = {1, 2, 3, 4, 5, 6, 7};
        list.add(array4);
        int[] array5 = new int[0];
        list.add(array5);
        return list;
    }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
