package pl.codegym.task.task15.task1528;

/* 
OOP: euro to też pieniądze
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(new Euro().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {

            return getMoney().getAmount();
        }
    }

    // Dodaj tutaj swój kod
    public static class Euro extends Money {
        private double amount = 123d;

        public Euro getMoney() {

            return this;
        }

        @Override
        public Object getAmount() {
            return this.amount;
        }
    }
}
