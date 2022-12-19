package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {
        //tutaj wpisz swój kod
        int cat1Power = 0;
        int cat2Power = 0;
        try {
            if (wiek != 0) {
                cat1Power = this.waga * this.sila / this.wiek;
                cat2Power = innyKot.waga * innyKot.sila / innyKot.wiek;
            }
        } catch (Exception e) {
            return e.equals("null");

        }
        return (cat1Power > cat2Power);
    }

    public static void main(String[] args) {
        Kot cat1 = new Kot();
        cat1.wiek = 12;
        cat1.waga = 9;
        cat1.sila = 5;

        Kot cat2 = new Kot();
        cat2.wiek = 3;
        cat2.waga = 7;
        cat2.sila = 4;

        System.out.println(cat1.walka(cat2));
        System.out.println(cat2.walka(cat1));
    }
}