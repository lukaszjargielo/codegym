package pl.codegym.task.task05.task0518;

/* 
Rejestr psów
*/

public class Pies {
    //tutaj wpisz swój kod
    private String imie;
    private String kolor;
    private int wzrost;

    public Pies(String imie) {
        this.imie = imie;
    }

    public Pies(String imie, int wzrost) {
        this.imie = imie;
        this.wzrost = wzrost;
    }

    public Pies(String imie, int wzrost, String kolor) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
