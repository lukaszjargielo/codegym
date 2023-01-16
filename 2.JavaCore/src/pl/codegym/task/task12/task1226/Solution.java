package pl.codegym.task.task12.task1226;

/* 
Wspinaj się, lataj i biegaj
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly {

        void fly();
    }

    public interface CanClimb {

        void climb();

    }

    public interface CanRun {

        void run();

    }

    public class Cat implements CanClimb, CanRun{

        @Override
        public void climb() {
            System.out.println("The cat is climbing.");
        }

        @Override
        public void run() {
            System.out.println("The cat is running.");

        }
    }

    public class Dog implements CanRun{

        @Override
        public void run() {
            System.out.println("The dog is running.");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun{

        @Override
        public void fly() {
            System.out.println("The duck is flying.");
        }

        @Override
        public void run() {
            System.out.println("The duck is running.");

        }
    }
}
