package pl.codegym.task.task16.task1615;

/* 
Lotnisko
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // 1 pas startowy

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Plane #1");
        Plane plane2 = new Plane("Plane #2");
        Plane plane3 = new Plane("Plane #3");
    }

    private static void waitForTakeoff() {
        // tutaj wpisz swój kod
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {

        }
    }

    private static void takeOff() {
        // Popraw tę metodę
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean hasAlreadyTakenOff = false;
            while (!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {    // jeśli pas startowy jest dostępny, to go weźmiemy
                    System.out.println(getName() + " leci");
                    takeOff();// leci
                    System.out.println(getName() + " na niebie");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {  // jeśli pas startowy jest zajęty przez samolot
                    System.out.println(getName() + " czeka");
                    waitForTakeoff(); // czeka
                }
            }
        }
    }

    public static class Runway {
        private Thread t;

        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

