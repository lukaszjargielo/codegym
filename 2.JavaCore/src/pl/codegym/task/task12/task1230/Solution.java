package pl.codegym.task.task12.task1230;

/* 
Strzał w dziesiątkę
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {

        return i * i;
    }

    public static int transformValue(Integer i) {

        return i * 2;

    }
}
