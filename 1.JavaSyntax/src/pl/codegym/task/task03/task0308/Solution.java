package pl.codegym.task.task03.task0308;

/* 
Iloczyn 10 liczb
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        int result = 1;
        for(int i = 1; i < 11; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
