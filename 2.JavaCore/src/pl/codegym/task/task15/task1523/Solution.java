package pl.codegym.task.task15.task1523;

/* 
Przeciążanie konstruktorów
*/

public class Solution {
    private Solution(String message) {
        System.out.println("This is private constructor." + message);
    }

    Solution(int number) {
        System.out.println("This is default constructor. The given number is " + number);
    }

    protected Solution(Object o) {
        System.out.println("This is protected constructor. Object was created based on" + o);
    }

    public Solution() {
        System.out.println("This is public constructor.");
    }
    public static void main(String[] args) {

    }
}

