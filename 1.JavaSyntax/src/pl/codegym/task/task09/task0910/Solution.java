package pl.codegym.task.task09.task0910;

import java.util.ArrayList;

/* 
Wyjątek podczas pracy z kolekcjami List
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        try {

            ArrayList<String> lista = new ArrayList<String>(); //
            String s = lista.get(18); //
            //tutaj wpisz swój kod

        } catch (IndexOutOfBoundsException e) {

            System.out.println(e.getClass());
        }
    }
}