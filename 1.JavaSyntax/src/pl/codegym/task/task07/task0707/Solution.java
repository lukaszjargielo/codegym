package pl.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
Co to za rodzaj listy?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> list = new ArrayList<>();
        list.add("I");
        list.add("wish");
        list.add("you");
        list.add("Merry");
        list.add("Christmas");
        System.out.println(list.size());
        for (String s: list) {
            System.out.println(s);
        }
    }
}
