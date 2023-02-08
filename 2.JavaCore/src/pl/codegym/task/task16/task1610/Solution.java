package pl.codegym.task.task16.task1610;

/* 
Przyporządkowywanie wywołań do join()
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Misia");
        Cat cat2 = new Cat("Coco");
//        cat1.join();
//        cat2.join();
    }

    private static void investigateWorld() throws InterruptedException {
        Thread.sleep(200);
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) throws InterruptedException {
            super(name);
            kitten1 = new Kitten("Kociak 1 (matka - " + getName() + ")");
            kitten2 = new Kitten("Kociak 2 (matka - " + getName() + ")");
            start();
//            kitten1.join();
//            kitten2.join();
        }

        public void run() {
            System.out.println(getName() + " urodziła 2 kocięta");
            try {
                initAllKittens();
//                this.join();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Wszystkie kocięta są w koszyku. " + getName() + " przyniosła je z powrotem");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();
            kitten1.join();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {

            super(name);
        }

        public void run() {
            System.out.println(getName() + " wyszedł z koszyka");
            try {
                investigateWorld();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
