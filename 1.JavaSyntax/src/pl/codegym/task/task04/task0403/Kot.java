package pl.codegym.task.task04.task0403;

/* 
Jak ten kot ma na imię?
*/

public class Kot {
    private String imie = "bezimienny kot";

    public void setImie(String imie) {
        //tutaj wpisz swój kod
        this.imie = imie;
    }

    public static void main(String[] args) {
        Kot kot = new Kot();
        kot.setImie("Simba");
        System.out.println(kot.imie);
    }
}
