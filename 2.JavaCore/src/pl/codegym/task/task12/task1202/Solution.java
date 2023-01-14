package pl.codegym.task.task12.task1202;

/* 
Wieloryby, potomkowie krów
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
            return "";
        }
    }
}
