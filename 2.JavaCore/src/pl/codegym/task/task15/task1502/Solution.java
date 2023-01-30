package pl.codegym.task.task15.task1502;

/* 
OOP: dziedziczenie w królestwie zwierząt
*/

public class Solution {
    // Dodaj tutaj klasy Goose i Dragon

    public static void main(String[] args) {
//        System.out.println(new Goose().getSize());
//        System.out.println(new Dragon().getSize());
    }

    public static class BigAnimal {
        protected String getSize() {

            return "jak dinozaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {

            return "jak kot";
        }
    }

    public static class Goose extends SmallAnimal{
        @Override
        public String getSize() {
            return "Gęś jest mała, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal{
        @Override
        public String getSize() {
            return "Smok jest duży, " + super.getSize();
        }
    }
}
