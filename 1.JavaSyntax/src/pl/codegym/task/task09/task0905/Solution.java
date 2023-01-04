package pl.codegym.task.task09.task0905;

/* 
Krok po kroku po śladach stosu...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int glebokosc = getGlebokoscStosu();
    }

    public static int getGlebokoscStosu() {
        // tutaj wpisz swój kod
        int numOfElementsAtTheEnd = Thread.currentThread().getStackTrace().length;
        System.out.println(numOfElementsAtTheEnd);
//        for (StackTraceElement el : Thread.currentThread().getStackTrace()) {
//            System.out.println(el);
//
//        }
        return numOfElementsAtTheEnd;
    }
}

