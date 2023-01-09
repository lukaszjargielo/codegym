package pl.codegym.task.task10.task1003;

/* 
Zadanie nr 3 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b =  (byte) (i + f);

        System.out.println(b);
    }
}
