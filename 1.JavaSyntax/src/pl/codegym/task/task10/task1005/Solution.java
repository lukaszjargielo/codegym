package pl.codegym.task.task10.task1005;

/* 
Zadanie nr 5 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = 300;
        short c = (short) (b - a);//
        System.out.println(c);
    }
}