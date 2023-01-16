package pl.codegym.task.task12.task1221;

/* 
Każdy z nas w głębi duszy jest małym kotkiem...
*/

public class Solution {

    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {

        public String getName() {

            return "Jestem Puszek";
        }
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "Jestem kotem";
        }
    }
}
