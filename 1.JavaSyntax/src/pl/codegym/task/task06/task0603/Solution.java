package pl.codegym.task.task06.task0603;

/* 
Obiekty klasy Kot i Pies: w każdej po 50000
*/

public class Solution {
    public static void main(String[] args) {
        // tutaj wpisz swój kod

        for(int i = 0; i < 50000; i++) {
            Kot kot = new Kot();
            Pies pies = new Pies();
        }
    }
}

class Kot {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Kot został zniszczony");
    }
}

class Pies {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Pies został zniszczony");
    }
}
