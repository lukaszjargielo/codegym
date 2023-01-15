package pl.codegym.task.task12.task1219;

/* 
Stworzenie człowieka
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


    public class Human implements CanRun, CanSwim{

        @Override
        public void run() {
            System.out.println("The human is running.");
        }

        @Override
        public void swim() {
            System.out.println("The human is swimming.");
        }

    }

    public class Duck implements CanFly, CanRun, CanSwim{

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

    public class Penguin implements CanRun, CanSwim{

        @Override
        public void run() {
            System.out.println("The penguin is running.");
        }

        @Override
        public void swim() {
            System.out.println("The penguin is swimming.");
        }

    }

    public class Airplane implements CanFly, CanRun{

        @Override
        public void fly() {
            System.out.println("The plane is flying.");
        }

        @Override
        public void run() {
            System.out.println("The plane starts moving.");
        }

    }
}
