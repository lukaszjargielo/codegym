package pl.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* 
R czy L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("rosa"); // 0
        lista.add("luz"); // 1
        lista.add("lira"); // 2
        lista = napraw(lista);

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> napraw(ArrayList<String> lista) {
        // tutaj wpisz swój kod
        ListIterator<String> iter = lista.listIterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.contains("r")) {
                iter.remove();
            }
            if (s.contains("l")) {
                iter.add(s);
            }
        }
        return lista;
//        ArrayList<String> lista2 = lista;
//        for (String s : lista) {
//        if(s.contains("r"))
//            {
//                lista2.remove(lista2.indexOf(s));
//            }
//            if(s.contains("l")) {
//                lista2.add(s);
//            }
//
//        }
//        return lista2;

    }
}