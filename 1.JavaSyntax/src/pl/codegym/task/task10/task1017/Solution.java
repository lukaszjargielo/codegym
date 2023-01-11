package pl.codegym.task.task10.task1017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Bezpieczne odzyskiwanie z listy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            lista.add(x);
        }

        System.out.println(bezpiecznieGetElement(lista, 5, 1));
        System.out.println(bezpiecznieGetElement(lista, 20, 7));
        System.out.println(bezpiecznieGetElement(lista, -5, 9));
    }

    public static int bezpiecznieGetElement(ArrayList<Integer> lista, int indeks, int wartoscDomyslna) {
        //tutaj wpisz swój kod
        int i;
        try {


           /* return*/ i = lista.get(indeks); //here we should insert return statement

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return wartoscDomyslna;
//        } finally {
//            return wartoscDomyslna;
        }
        return i;
    }
}