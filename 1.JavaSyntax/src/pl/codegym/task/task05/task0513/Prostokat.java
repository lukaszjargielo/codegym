package pl.codegym.task.task05.task0513;

/* 
Stwórzmy sobie prostokąt
*/

public class Prostokat {
    //tutaj wpisz swój kod
    private int gora;
    private int lewy;
    private int szerokosc;
    private int wysokosc;

    public void inicjalizuj(int wysokosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = wysokosc;
    }

    public void inicjalizuj(Prostokat innyProstokat) {
        this.gora = innyProstokat.gora;
        this.lewy = innyProstokat.gora;
        this.szerokosc = innyProstokat.szerokosc;
        this.wysokosc = innyProstokat.wysokosc;
    }

    public void inicjalizuj(int gora, int lewy) {
        this.gora = gora;
        this.lewy = lewy;
    }

    public void inicjalizuj(int wysokosc, int lewy, int gora) {
        this.wysokosc = wysokosc;
        this.szerokosc = wysokosc;
        this.lewy = lewy;
        this.gora = gora;
    }

    public void inicjalizuj(int gora, int lewy, int szerokosc, int wysokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }



    public static void main(String[] args) {

    }
}
