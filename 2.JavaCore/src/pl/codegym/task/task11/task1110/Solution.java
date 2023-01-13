package pl.codegym.task.task11.task1110;

/* 
Nie zapomnij o enkapsulacji
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {

        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight) {

        }

        public String getName() {

            return this.name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getAge() {

            return this.age;
        }

        public void setAge(int age) {

            this.age = age;
        }

        public int getWeight() {

            return weight;
        }

        public void setWeight(int weight) {

            this.weight = weight;

        }

        public int getSpeed() {

            return speed;
        }

        public void setSpeed(int speed) {

            this.speed = speed;

        }
    }
}
