package pl.codegym.task.task12.task1201;

/* 
Wieloryby i krowy
*/

public class Solution {

    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {

            return "Jestem krową";
        }
    }

    public static class Whale extends Cow {

        @Override
        public String getName() {
            return "Nie jestem krową. Jestem wielorybem.";
        }
    }
}
