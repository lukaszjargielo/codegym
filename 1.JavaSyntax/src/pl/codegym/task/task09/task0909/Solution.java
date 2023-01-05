package pl.codegym.task.task09.task0909;

/* 
Wyjątek podczas pracy z tablicami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        try {

            int[] m = new int[2]; //
            m[8] = 5; //
            //tutaj wpisz swój kod

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        }
    }
}
