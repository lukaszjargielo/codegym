package pl.codegym.task.task04.task0409;

/* 
Najbliżej 10
*/

public class Solution {
    public static void main(String[] args) {
        wyswietlNajblizszaDziesiatce(8, 11);
        wyswietlNajblizszaDziesiatce(7, 14);
    }

    public static void wyswietlNajblizszaDziesiatce(int a, int b) {
        // tutaj wpisz swój kod
        System.out.println(abs(10 - a) <= abs(10 - b) ? a : b);
//         int aSubstraction =abs(10 - a);
//         int bSubstraction =abs(10 - b);
//        System.out.println(aSubstraction <= bSubstraction ? a : b);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}