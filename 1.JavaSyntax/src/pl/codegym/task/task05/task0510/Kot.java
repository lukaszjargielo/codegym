package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    private String imie;
    private String adres;
    private String kolor;
    private int wiek;
    private int waga;

    public void inicjalizuj(String imie) {
        this.imie = imie;
        this.kolor = "pręgowany";
        this.wiek = 7;
        this.waga = 5;
    }

    public void inicjalizuj(String imie, int waga, int wiek) {
        this.imie = imie;
        this.kolor = "pręgowany";
        this.wiek = wiek;
        this.waga = waga;
    }

    public void inicjalizuj(String imie, int wiek) {
        this.imie = imie;
        this.kolor = "pręgowany";
        this.wiek = wiek;
        this.waga = 7;
    }

    public void inicjalizuj(int waga, String kolor) {
        this.kolor = kolor;
        this.wiek = 5;
        this.waga = waga;
    }

    public void inicjalizuj(int waga, String kolor, String adres) {
        this.kolor = kolor;
        this.wiek = 5;
        this.waga = waga;
        this.adres = adres;
    }

    public static void main(String[] args) {

    }
}
