package pl.codegym.task.task03.task0314;

/* 
Tabliczka mnożenia
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        int num = 0;
        int row = 1;
        while (row <= 10) {
            System.out.print(++num * row  + " ");
            if (num == 10) {
                System.out.println();
                num = 0;
                row++;
            }
        }
    }
}
