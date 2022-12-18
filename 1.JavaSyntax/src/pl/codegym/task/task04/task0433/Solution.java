package pl.codegym.task.task04.task0433;


/* 
Zobaczyć dolary w przyszłości
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int countInner = 1;
        int countOuter = 1;
        while (countInner < 11){
            System.out.print("$");
            countInner++;
            if (countInner == 11) {
                System.out.println();
                countInner = 1;
                countOuter++;
                if (countOuter == 11) {
                    break;
                }
            }
        }
    }
}
