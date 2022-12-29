package pl.codegym.task.task07.task0725;

/* 
Przestaw modyfikator statyczny
*/

public class Solution {

    public final static int A = 5; //
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public /*static*/ int getValue() {
        return C;
    }
}
