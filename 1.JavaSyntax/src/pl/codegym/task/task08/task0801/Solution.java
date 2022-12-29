package pl.codegym.task.task08.task0801;

/* 
HashSet roślin
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        HashSet<String> set = new HashSet<>();
        set.add("arbuz");
        set.add("banan");
        set.add("wiśnia");
        set.add("gruszka");
        set.add("kantalupa");
        set.add("jeżyna");
        set.add("żeńszeń");
        set.add("truskawka");
        set.add("irys");
        set.add("ziemniak");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
