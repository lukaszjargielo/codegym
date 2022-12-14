package pl.codegym.task.task01.task0133;

/* 
Nie myśl o sekundach...
*/

public class Solution {
    public static void main(String[] args) {
        int min = 30;
        int sekundyPo15 = secondsElapsed(min);
        System.out.println(sekundyPo15);
    }
    public static int secondsElapsed(int min) {
        return min * 60;
    }
}