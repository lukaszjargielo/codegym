package pl.codegym.task.task04.task0401;

/* 
Ten wiek źle na mnie działa...
*/

public class Solution {
    public static void main(String[] args) {

        Osoba osoba = new Osoba();
        System.out.println("Wiek: " + osoba.wiek);
        osoba.dostosujWiek(osoba.wiek);
        System.out.println("Dostosowany wiek: " + osoba.wiek);
    }

    public static class Osoba {
        public int wiek = 20;

        public void dostosujWiek(int wiek) {
            this.wiek = wiek + 20;
            System.out.println("Wiek w dostosujWiek() to " + this.wiek);
        }
    }
}
