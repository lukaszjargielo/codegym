package pl.codegym.task.task10.task1001;

/* 
Zadanie nr 1 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b =  a + 46;
        byte c = (byte) (a * b);
        double f =  1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
