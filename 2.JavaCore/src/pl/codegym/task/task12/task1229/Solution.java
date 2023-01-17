package pl.codegym.task.task12.task1229;

/* 
Klasa macierzysta klasy CTO
*/

class Management {

    private void workHard() {
        System.out.println("The Member of Board working hard!");
    }
}

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static void printInfo() {
        System.out.println("Secret message. Don't open!");
    }

    public static interface Businessman {
        public default void workHard() {
            System.out.println("The businessman working hard.");

        }


    }

    public static class CTO extends Management implements Businessman {


    }
}








