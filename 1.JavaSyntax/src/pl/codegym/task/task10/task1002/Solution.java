package pl.codegym.task.task10.task1002;

/* 
Zadanie nr 2 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b; //
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
