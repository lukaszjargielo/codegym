package pl.codegym.task.task13.task1301;

/* 
Piwo
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        @Override
        public void askForMore(String message) {
            System.out.println("Could I please order " + message);
        }

        @Override
        public void sayThankYou() {
            System.out.println("Thanks for a meeting!");
        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println("The floor is enough to sleep. Good night!");
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
    }
}
