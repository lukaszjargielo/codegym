package pl.codegym.task.task06.task0613;

/* 
Kot i statyczne
*/

public class Solution {
    public static void main(String[] args) {
        // Tworzy 10 kotów
        for(int i = 0; i < 10; i++) {
            Kot kot = new Kot();
        }

        // Wyświetla wartość zmiennej licznikKotow
        System.out.println(Kot.licznikKotow);
    }

    public static class Kot {
        // Tworzy zmienną statyczną licznikKotow
        public static int licznikKotow;

        // Deklaruje konstruktor
        public Kot() {
            licznikKotow++;
        }
    }
}
