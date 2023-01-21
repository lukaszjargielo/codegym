package pl.codegym.task.task13.task1315;

/* 
Tom, Jerry i Spike
*/

public class Solution {

    public static void main(String[] args) {

    }

    // Potrafi się poruszać
    public interface CanMove {
        void move();
    }

    // Może zostać zjedzony
    public interface Edible {
        void beEaten();
    }

    // Potrafi jeść
    public interface CanEat {
        void eat();
    }

    public static class Dog implements CanMove, CanEat {

        @Override
        public void move() {

            System.out.println("Killer runs fast.");
        }

        @Override
        public void eat() {

            System.out.println("Killer can eat Tom.");

        }
    }

    public static class Cat implements CanMove, CanEat, Edible {

        @Override
        public void move() {

            System.out.println("Tom chases after and runs away quickly.");

        }

        @Override
        public void beEaten() {

            System.out.println("Tom can be eaten by Killer.");
        }

        @Override
        public void eat() {

            System.out.println("Tom can eat Jerry.");

        }
    }

    public static class Mouse implements CanMove, Edible {
        @Override
        public void move() {

            System.out.println("Jerry runs away very quickly.");
        }

        @Override
        public void beEaten() {

            System.out.println("Jerry can be eaten by Tom.");

        }
    }
}