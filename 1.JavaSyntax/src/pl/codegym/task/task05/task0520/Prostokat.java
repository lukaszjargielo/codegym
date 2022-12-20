package pl.codegym.task.task05.task0520;

/* 
Utwórz klasę Prostokat
*/

public class Prostokat {
    //tutaj wpisz swój kod
    private int gora;
    private int lewy;
    private int wysokosc;
    private int szerokosc;

    public Prostokat(int gora, int lewy, int wysokosc, int szerokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }

    public Prostokat(int gora, int lewy) {
        this.gora = gora;
        this.lewy = lewy;
        this.wysokosc = this.szerokosc = 0;
    }

    public Prostokat(int szerokosc) {
        this.wysokosc = this.szerokosc = szerokosc;
    }

    public Prostokat(Prostokat innyProstokat) {
        this.gora = innyProstokat.gora;
        this.lewy = innyProstokat.lewy;
        this.wysokosc = innyProstokat.wysokosc;
        this.szerokosc = innyProstokat.szerokosc;
    }

    public Prostokat(int gora, int lewy, int wysokosc) {
        this.gora = gora;
        this.lewy = lewy;
       this.szerokosc = this.wysokosc = wysokosc;
    }

    public static void main(String[] args) {

    }
}
