package pl.codegym.task.task09.task0904;

/* 
Ślad stosu z 10 wywołaniami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int dlugoscSladuStosu = method1().length - method10().length + 1;
//        System.out.println(dlugoscSladuStosu);
    }

    public static StackTraceElement[] method1() {

        return method2();
    }

    public static StackTraceElement[] method2() {
        //tutaj wpisz swój kod
        return method3();
    }

    public static StackTraceElement[] method3() {
        //tutaj wpisz swój kod
        return method4();
    }

    public static StackTraceElement[] method4() {
        //tutaj wpisz swój kod
        return method5();
    }

    public static StackTraceElement[] method5() {
        //tutaj wpisz swój kod
        return method6();
    }

    public static StackTraceElement[] method6() {
        //tutaj wpisz swój kod
        return method7();
    }

    public static StackTraceElement[] method7() {
        //tutaj wpisz swój kod
        return method8();
    }

    public static StackTraceElement[] method8() {
        //tutaj wpisz swój kod
        return method9();
    }

    public static StackTraceElement[] method9() {

        return method10();
    }

    public static StackTraceElement[] method10() {

        return Thread.currentThread().getStackTrace();
    }
}
