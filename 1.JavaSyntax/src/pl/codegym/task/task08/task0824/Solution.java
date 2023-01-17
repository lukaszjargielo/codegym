package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod

        Ludzie dziadek1 = new Ludzie("Stefan", true, 88);
        Ludzie babcia1 = new Ludzie("Wanda", false, 88);
        Ludzie dziadek2 = new Ludzie("Józef", true, 85);
        Ludzie babcia2 = new Ludzie("Elżbieta", false, 85);
        Ludzie ojciec = new Ludzie("Henryk", true, 66);
        Ludzie matka = new Ludzie("Grażyna", false, 63);
        Ludzie dziecko1 = new Ludzie("Anna", false, 41);
        Ludzie dziecko2 = new Ludzie("Natalia", false, 32);
        Ludzie dziecko3 = new Ludzie("Łukasz", true, 33);

//        dziadek1.setDzieci(matka);
//        babcia1.setDzieci(matka);
//        dziadek2.setDzieci(ojciec);
//        babcia2.setDzieci(ojciec);
//        ojciec.setDzieci(dziecko1);
//        ojciec.setDzieci(dziecko2);
//        ojciec.setDzieci(dziecko3);
//        matka.setDzieci(dziecko1);
//        matka.setDzieci(dziecko2);
//        matka.setDzieci(dziecko3);

        dziadek1.dzieci.add(matka);
        babcia1.dzieci.add(matka);
        dziadek2.dzieci.add(ojciec);
        babcia2.dzieci.add(ojciec);
        ojciec.dzieci.add(dziecko1);
        ojciec.dzieci.add(dziecko2);
        ojciec.dzieci.add(dziecko3);
        matka.dzieci.add(dziecko1);
        matka.dzieci.add(dziecko2);
        matka.dzieci.add(dziecko3);

        System.out.println(dziadek1);
        System.out.println(babcia1);
        System.out.println(dziadek2);
        System.out.println(babcia2);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(dziecko1);
        System.out.println(dziecko2);
        System.out.println(dziecko3);

    }

    public static class Ludzie {
        //tutaj wpisz swój kod
        /*private*/ String imie;
        /*private*/ boolean plec;
        /*private*/ int wiek;
        /*private*/ ArrayList<Ludzie> dzieci = new ArrayList<>();


        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i < licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;

        }
//
//        public String getImie() {
//            return imie;
//        }
//
//        public void setImie(String imie) {
//            this.imie = imie;
//        }
//
//        public boolean isPlec() {
//            return plec;
//        }
//
//        public void setPlec(boolean plec) {
//            this.plec = plec;
//        }
//
//        public int getWiek() {
//            return wiek;
//        }
//
//        public void setWiek(int wiek) {
//            this.wiek = wiek;
//        }
//
//        public ArrayList<Ludzie> getDzieci() {
//            return dzieci;
//        }
//
//        public void setDzieci(Ludzie dziecko) {
//
//            this.dzieci.add(dziecko);
//        }
    }

}
