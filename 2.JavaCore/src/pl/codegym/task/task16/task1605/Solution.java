package pl.codegym.task.task16.task1605;

import java.util.Date;

/* 
Porozmawiajmy o muzyce
*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Muzyk"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {

        private String owner;

        public Violin(String owner) {

            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " zaczyna grać");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " przestaje grać");
            return new Date();
        }

        @Override
        public void run() {
            Date date1 = startPlaying();
            Solution.sleepNSeconds(1);
            Date date2 = stopPlaying();
            System.out.println(new StringBuilder().append("Grałeś przez ").append(date2.getTime() - date1.getTime()).append(" ms").toString());
        }
    }
}
