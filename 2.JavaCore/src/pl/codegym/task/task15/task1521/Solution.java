package pl.codegym.task.task15.task1521;

import java.math.BigDecimal;

/* 
OOP: przeciążanie metod
*/

public class Solution {
    public static void main(String[] args) {
        // Blok 2.
        // Wywoływanie obiektów
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // Blok 3.
        // Wywoływanie liczb
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // Blok 4.
        // Wywoływanie ciągów
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
