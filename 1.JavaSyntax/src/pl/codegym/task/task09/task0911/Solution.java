package pl.codegym.task.task09.task0911;

import java.util.HashMap;

/* 
Wyjątek podczas pracy z kolekcjami Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        try {

            HashMap<String, String> mapa = new HashMap<String, String>(null); //
            mapa.put(null, null); //
            mapa.remove(null); //
            //tutaj wpisz swój kod

        } catch (NullPointerException e) {
            System.out.println(e.getClass());
        }
    }
}
