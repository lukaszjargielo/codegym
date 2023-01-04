package pl.codegym.task.task09.task0901;

/* 
Zwracanie śladu stosu
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(method1());
    }

    public static StackTraceElement[] method1() {
        method2();
        //tutaj wpisz swój kod
       return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //tutaj wpisz swój kod
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //tutaj wpisz swój kod

        return Thread.currentThread().getStackTrace();
    }
}
