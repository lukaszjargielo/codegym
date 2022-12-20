package pl.codegym.task.task05.task0516;

/* 
Przyjaciół nie da się kupić
*/

public class Przyjaciel {
    //tutaj wpisz swój kod
    private String imie;
    private char plec;
    private int wiek;

    public Przyjaciel(String imie) {
        this.imie = imie;
    }

    public Przyjaciel(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Przyjaciel(String imie, int wiek, char plec) {
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;
    }

    public static void main(String[] args) {

    }
}
