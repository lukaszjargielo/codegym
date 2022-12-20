package pl.codegym.task.task05.task0514;

/* 
I programista stworzył człowieka
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Osoba osoba = new Osoba();
        osoba.inicjalizuj("Lucas", 33);
    }

    static class Osoba {
        //tutaj wpisz swój kod
        private String imie;
        private int wiek;

        public void inicjalizuj(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }
    }
}
