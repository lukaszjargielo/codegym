package pl.codegym.task.task09.task0903;

/* 
Kto mnie wywołał?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        return  /*tutaj wpisz swój kod*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  /*tutaj wpisz swój kod*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  /*tutaj wpisz swój kod*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  /*tutaj wpisz swój kod*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement el : elements) {
//            System.out.println(el.getMethodName() + "\\" + el.getLineNumber() );
//        }

        return  /*tutaj wpisz swój kod*/ Thread.currentThread().getStackTrace()[2].getLineNumber();

    }
}
