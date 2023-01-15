package pl.codegym.task.task12.task1210;

/* 
Trzy metody i maksimum
*/

public class Solution {
    public static void main(String[] args) {

    }

    //tutaj wpisz swój kod

    public static int max(int i1, int i2) {

        return Integer.max(i1, i2);

    }

    public static long max(long l1, long l2) {

        if (l1 > l2) {
            return l1;
        } else {
            return l2;
        }
    }

    public static double max(double d1, double d2) {

        return Double.max(d1, d2);

    }
}
