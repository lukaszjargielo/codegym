package pl.codegym.task.task12.task1232;

/* 
Dodawanie nowej funkcjonalności
*/

public class Solution {
    public static void main(String[] args) {

        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly{

        public void fly() {
            System.out.println("My pegasus, fly!");
        }
    }
}
