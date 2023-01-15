package pl.codegym.task.task12.task1209;

/* 
Trzy metody i minimum
*/

public class Solution {
    public static void main(String[] args) {

    }

    //tutaj wpisz swój kod

    public static int min(int i1, int i2) {

        return Integer.min(i1,i2);

    }

    public static long min(long l1, long l2) {

        if (l1 < l2) {
            return l1;
        }else {
            return l2;
        }
    }

    public static double min(double d1, double d2) {

        return  Double.min(d1,d2);

    }

}
