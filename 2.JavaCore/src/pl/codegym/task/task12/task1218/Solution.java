package pl.codegym.task.task12.task1218;

/* 
Jedz, lataj i ruszaj się
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat{

        public void move() {
            System.out.println("The dog is running.");
        }

        public void eat() {
            System.out.println("The dog is eating.");
        }
    }

    public class Duck implements CanFly, CanMove, CanEat{

        public void fly() {
            System.out.println("The duck is flying.");
        }

        public void move() {
            System.out.println("The duck is running.");
        }

        public void eat() {
            System.out.println("The eat is eating.");
        }
    }

    public class Car implements CanMove{

        public void move() {
            System.out.println("The car is moving.");
        }
    }

    public class Airplane implements CanFly, CanMove{


        public void fly() {
            System.out.println("The plane is flying.");
        }


        public void move() {
            System.out.println("The plane is moving.");
        }
    }
}
