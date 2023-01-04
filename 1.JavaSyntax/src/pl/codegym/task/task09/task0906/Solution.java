package pl.codegym.task.task09.task0906;

/* 
Logowanie śladów stosu
*/

public class Solution {
    public static void main(String[] args) {

        log("W metodzie main");
    }

    public static void log(String s) {
        //tutaj wpisz swój kod

        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + ": "
                + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + s);
    }
}
