package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Mezczyzna mezczyzna1 = new Mezczyzna("Stefan", 41,"Rybnik. Polna 1");
        Mezczyzna mezczyzna2 = new Mezczyzna("Wacław", 53,"Knurów. Kopalniana 8");
        Kobieta kobieta1 = new Kobieta("Adelajda", 88, "Pyskowice ul. Kopaniny 2");
        Kobieta kobieta2 = new Kobieta("Getruda", 18, "Gliwice ul. Chrobrego 12");
        System.out.println(mezczyzna1);
        System.out.println(mezczyzna2);
        System.out.println(kobieta1);
        System.out.println(kobieta2);
    }
    //tutaj wpisz swój kod
    public static class Mezczyzna {
        private String imie;
        private String adres;
        private int wiek;

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        @Override
        public String toString() {
            return imie + " " + wiek + " " + adres;
        }
    }
    public static class Kobieta {
        private String imie;
        private String adres;
        private int wiek;

        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        @Override
        public String toString() {
            return imie + " " + wiek + " " + adres;
        }
    }

}
