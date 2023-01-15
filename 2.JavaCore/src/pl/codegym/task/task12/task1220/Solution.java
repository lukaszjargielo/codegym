package pl.codegym.task.task12.task1220;

/* 
Klasa Human i interfejsy CanRun i CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    // Add public interfaces and a public class here

    interface CanRun {

        void run();

    }

    interface CanSwim {

        void swim();

    }

    public abstract class Human implements CanRun, CanSwim {

//        public void run() {
//            System.out.println("The human is running.");
//        }
//
//        public void swim() {
//            System.out.println("The human is swimming.");
//        }
    }
}
