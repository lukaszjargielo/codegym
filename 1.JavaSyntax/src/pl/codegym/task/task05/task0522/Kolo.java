package pl.codegym.task.task05.task0522;

/* 
Maksimum konstruktorów
*/

public class Kolo {

    public double x;
    public double y;
    public double promien;

    //tutaj wpisz swój kod

    public Kolo() {
        this.x = 10;
        this.y = 10;
        this.promien = 5;
    }

    public Kolo(double promien) {
        this.promien = promien;
        this.x =  this.y = promien * 2;
    }

    public Kolo(double y, double promien) {
        this.x = this.y = y;
        this.promien = promien;
    }

    public Kolo(double x, double y, double promien) {
        this.x = x;
        this.y = y;
        this.promien = promien;
    }

    public Kolo(Kolo inneKolo) {
        this.x = inneKolo.x;
        this.y = inneKolo.y;
        this.promien = inneKolo.promien;
    }

    public static void main(String[] args) {

    }
}