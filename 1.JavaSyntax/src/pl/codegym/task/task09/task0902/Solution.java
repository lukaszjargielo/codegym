package pl.codegym.task.task09.task0902;

/* 
Ślad stosu wita ponownie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //tutaj wpisz swój kod
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //tutaj wpisz swój kod
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //tutaj wpisz swój kod
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //tutaj wpisz swój kod
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        //tutaj wpisz swój kod
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement el : stackTraceElements) {
//            System.out.println(el.getMethodName());
////
////
//        }
//        System.out.println(stackTraceElements[2].getMethodName());

        return stackTraceElements[2].getMethodName();

    }
}

