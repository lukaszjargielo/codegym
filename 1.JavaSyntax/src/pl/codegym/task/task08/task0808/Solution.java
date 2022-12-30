package pl.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 tysięcy usunięć i wstawień
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        wstaw10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        usun10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        wstaw10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        usun10000(linkedList);
    }

    public static void wstaw10000(List lista) {
        //tutaj wpisz swój kod
        for (int i = 0; i < 10000; i++) {
            lista.add(i);
        }

    }

    public static void get10000(List lista) {
        //tutaj wpisz swój kod
        for (int i = 0; i < 10000; i++) {
            lista.get(i);
        }

    }

    public static void set10000(List lista) {
        //tutaj wpisz swój kod
        for (int i = 0; i < 10000; i++) {
            lista.set(i, i);
        }

    }

    public static void usun10000(List lista) {
        //tutaj wpisz swój kod
        for (int i = 0; i < 10000; i++) {
            lista.remove(9999 - i);
        }

    }
}
