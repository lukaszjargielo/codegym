package pl.codegym.task.task16.task1602;

/* 
Mój drugi wątek
*/

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }
    public static class TestThread extends Thread{
        static {
            System.out.println("To jest blok statyczny wewnątrz TestThread");
        }

        @Override
        public void run() {
            System.out.println("To jest metoda run");;
        }
    }
}
