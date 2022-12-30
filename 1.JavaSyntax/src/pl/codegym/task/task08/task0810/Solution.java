package pl.codegym.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Czas na 10000 wywołań get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCzasGetWms(zapelnij(new ArrayList())));
        System.out.println(getCzasGetWms(zapelnij(new LinkedList())));
    }

    public static List zapelnij(List lista) {
        for (int i = 0; i < 10000; i++) {
            lista.add(new Object());
        }
        return lista;
    }

    public static long getCzasGetWms(List lista) {
        // tutaj wpisz swój kod
        Date date1 = new Date();

        get10000(lista);

        // tutaj wpisz swój kod

        Date date2 = new Date();

        return date2.getTime() - date1.getTime();

    }

    public static void get10000(List lista) {
        if (lista.isEmpty()) {
            return;
        }
        int x = lista.size() / 2;

        for (int i = 0; i < 10000; i++) {
            lista.get(x);
        }
    }
}
