package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

public class Solution {
    public static void main(String[] args) {
        // tutaj wpisz swój kod
        Ludzie dziadek1 = new Ludzie("Wiesław", true, 88);
        Ludzie dziadek2 = new Ludzie("Jerzy", true, 68);
        Ludzie babcia1 = new Ludzie("Mirosława", false, 85);
        Ludzie babcia2 = new Ludzie("Danuta", false, 68);
        Ludzie ojciec = new Ludzie("Tomasz", true, 38, dziadek1, babcia1);
        Ludzie matka = new Ludzie("Anita", false, 30, dziadek2, babcia2);
        Ludzie dziecko1 = new Ludzie("Jan", true, 3, ojciec, matka);
        Ludzie dziecko2 = new Ludzie("Łucja", false, 2, ojciec, matka);
        Ludzie dziecko3 = new Ludzie("Bonifacy", true, 1, ojciec, matka);

        System.out.println(dziadek1);
        System.out.println(dziadek2);
        System.out.println(babcia1);
        System.out.println(babcia2);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(dziecko1);
        System.out.println(dziecko2);
        System.out.println(dziecko3);
    }

    public static class Ludzie {
        // tutaj wpisz swój kod
        private String imie;
        private boolean plec;
        private int wiek;
        Ludzie ojciec;
        Ludzie matka;

        public Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null) {
                tekst += ", ojciec: " + this.ojciec.imie;
            }

            if (this.matka != null) {
                tekst += ", matka: " + this.matka.imie;
            }

            return tekst;
        }
    }
}