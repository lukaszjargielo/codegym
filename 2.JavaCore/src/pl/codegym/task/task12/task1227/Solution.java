package pl.codegym.task.task12.task1227;

/* 
CanFly, CanRun i CanSwim dla klas Duck, Penguin i Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly, CanRun, CanSwim {
        @Override
        public void fly() {
            System.out.println("The duck is flying.");
        }

        @Override
        public void run() {
            System.out.println("The duck is running.");
        }

        @Override
        public void swim() {
            System.out.println("The duck is swimming.");
        }
    }

    public class Penguin implements CanRun, CanSwim {
        @Override
        public void run() {
            System.out.println("The penguin is running.");
        }

        @Override
        public void swim() {
            System.out.println("The penguin is swimming.");
        }
    }

    public class Toad implements CanSwim {

        @Override
        public void swim() {
            System.out.println("The toad is swimming.");

        }
    }
}
