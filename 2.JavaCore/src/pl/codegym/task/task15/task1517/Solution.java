package pl.codegym.task.task15.task1517;

/* 
Modyfikatory statyczne i wyjątki
*/

public class Solution {
    public static int A = 0;

    static {
        // Throw an exception here
        if (A == 0) {

            throw new ArithmeticException();


        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
