package pl.codegym.task.task05.task0515;

/* 
Inicjalizowanie obiektów
*/

public class Osoba {

    String imie;
    char plec;
    int pieniadze;
    int waga;
    double rozmiar;

//    public void inicjalizuj(String imie) {
//
//        this.imie = imie;
//    }
//
//    public void inicjalizuj(String imie, char plec) {
//        this.imie = imie;
//        this.plec = plec;
//    }

    public void inicjalizuj(String imie, char plec, int waga, double rozmiar, int pieniadze) {
        this.imie = imie;
        this.plec = plec;
        this.waga = waga;
        this.rozmiar = rozmiar;
        this.pieniadze = pieniadze;
    }

    public static void main(String[] args) {

    }
}
