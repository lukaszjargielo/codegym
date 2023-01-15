package pl.codegym.task.task12.task1215;

/* 
Koty nie mogą być abstrakcyjne!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {

        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{

        @Override
        public String getName(){
            return "I'm a cat!";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet{

        @Override
        public String getName() {
            return "I'm a dog!";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }

}
