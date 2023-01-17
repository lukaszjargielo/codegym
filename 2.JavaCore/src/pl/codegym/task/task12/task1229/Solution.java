package pl.codegym.task.task12.task1229;

/* 
Klasa macierzysta klasy CTO
*/

public class Solution {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class Management {
        public void workHard() {
            System.out.println("The Member of Board working hard!");
        }
    }

    public static interface Businessman {
        public void workHard();
        
    }

    public static class CTO extends Management implements Businessman {


    }
}








