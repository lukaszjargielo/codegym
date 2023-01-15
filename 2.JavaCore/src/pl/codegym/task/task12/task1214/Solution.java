package pl.codegym.task.task12.task1214;

/* 
Krowy to też zwierzęta
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{

        public String getName() {
            return "I'm a cow.";
        }
    }

}
