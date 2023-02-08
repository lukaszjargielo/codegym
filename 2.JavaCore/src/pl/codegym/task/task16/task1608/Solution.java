package pl.codegym.task.task16.task1608;

/* 
Zdobywanie poparcia podczas debat politycznych
*/

public class Solution {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician chump = new Politician("Chump");
        chump.join();
        Politician dustbin = new Politician("Dustbin");
        Politician schooner = new Politician("Schooner");

        while (chump.getSpeechCount() + dustbin.getSpeechCount() + schooner.getSpeechCount() < totalSpeechCount) {
        }

        System.out.println(chump);
//        chump.join();
        System.out.println(dustbin);
//        dustbin.join();
        System.out.println(schooner);
//        schooner.join();
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {

            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {

            return String.format("%s wypowiadał się %d razy", getName(), getSpeechCount());
        }
    }
}

