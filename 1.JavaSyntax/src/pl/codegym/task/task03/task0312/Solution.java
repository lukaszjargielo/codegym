package pl.codegym.task.task03.task0312;

/* 
Konwersja czasu
*/

public class Solution {
    //tutaj wpisz swój kod
    public static int konwertujNaSekundy(int godzina) {
        return godzina * 60 * 60;
    }

    public static void main(String[] args) {
        //tutaj wpisz swój kod
        System.out.println(konwertujNaSekundy(1));
        System.out.println(konwertujNaSekundy(24));
    }
}
