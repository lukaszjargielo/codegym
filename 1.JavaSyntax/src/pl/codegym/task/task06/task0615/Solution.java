package pl.codegym.task.task06.task0615;

/* 
Feng Shui i statyczne
*/

public class Solution {

    public static int A = 5; // add static modifier
    public int B = 2;
    public int /*static*/ C = A * B;

    public static void main(String[] args) {

        A = 15;
    }
}
