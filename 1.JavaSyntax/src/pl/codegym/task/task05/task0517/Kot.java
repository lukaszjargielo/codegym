package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    private String imie;
    private String adres;
    private String kolor;
    private int wiek;
    private int waga;

    public Kot(String imie) {
        this.imie = imie;
        this.wiek = 7;
        this.waga = 5;
        this.kolor = "laciaty";
    }

    public Kot(String imie, int waga, int wiek ) {
        this.imie = imie;
        this.waga = waga;
        this.wiek = wiek;
        this.kolor = "laciaty";
    }

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = 5;
    }

    public Kot(int waga, String kolor) {
        this.waga = waga;
        this.kolor = kolor;
        this.wiek = 7;
//        this.imie = "nieznane";
//        this.adres = "nieokreslony";
    }

    public Kot(int waga, String kolor, String adres) {
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
        this.wiek = 7;
//        this.imie = "nieznane";
    }

    public static void main(String[] args) {

    }
}
