package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        System.out.println(konwertujEurNaUsd(100,1.06));
        System.out.println(konwertujEurNaUsd(56,1.06));
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
        //tutaj wpisz swój kod
        return eur * kursWymiany;
    }
}
