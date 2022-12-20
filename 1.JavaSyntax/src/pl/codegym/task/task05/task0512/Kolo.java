package pl.codegym.task.task05.task0512;

/* 
Utwórz klasę Kolo
*/

public class Kolo {
    //tutaj wpisz swój kod
    private int srodekX;
    private int srodekY;
    private int promien;
    private int szerokosc;
    private int kolor;

    public void inicjalizuj(int srodekX, int srodekY, int promien) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
    }

    public void inicjalizuj(int srodekX, int srodekY, int promien, int szerokosc) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
    }

    public void inicjalizuj(int srodekX, int srodekY, int promien, int szerokosc, int kolor) {
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
