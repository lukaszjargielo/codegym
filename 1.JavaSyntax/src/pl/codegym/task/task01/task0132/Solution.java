package pl.codegym.task.task01.task0132;

/* 
Suma cyfr trzycyfrowej liczby
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumaCyfrLiczby(782));
    }

    public static int sumaCyfrLiczby(int liczba) {
        //tutaj wpisz swój kod
        int fullNum = liczba;
        int hundreds = fullNum / 100;
        int numMinusHundreds = liczba - (hundreds * 100);
        int tens = numMinusHundreds / 10;
        int numMinusTens = numMinusHundreds - (tens * 10);
        int unity = numMinusTens;
        return hundreds + tens + unity;
    }
}