package pl.codegym.task.task15.task1520;

/* 
Trening mózgu
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements CanFly, CanMove {
        @Override
        public void doAction() {

            System.out.println("Latanie");
        }

        @Override
        public void doAnotherAction() {
            System.out.println("Poruszanie się");
        }
    }

    public static class Util {

        static void fly(CanFly animal)
        {
            animal.doAction();
        }

        static void move(CanMove animal) {

            animal.doAnotherAction();
        }
    }

    public static interface CanFly {
        void doAction();
    }

    public static interface CanMove {
        void doAnotherAction();
    }
}
