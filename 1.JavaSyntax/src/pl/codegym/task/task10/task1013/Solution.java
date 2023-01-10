package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Ludzie {
        // Wprowadź tu swoje zmienne i konstruktory
        private String name;
        private String occupation;
        private int age;
        private boolean drivingLicense;
        private float height;
        private char sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isDrivingLicense() {
            return drivingLicense;
        }

        public void setDrivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public Ludzie(String name) {
            this.name = name;
        }

        public Ludzie(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }

        public Ludzie(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Ludzie(String name, int age, float height, char sex) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
        }

        public Ludzie(String name, String occupation) {
            this.name = name;
            this.occupation = occupation;
        }

        public Ludzie(String name, String occupation, boolean drivingLicense) {
            this.name = name;
            this.occupation = occupation;
            this.drivingLicense = drivingLicense;
        }

        public Ludzie(String name, String occupation, int age, boolean drivingLicense, char sex) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.drivingLicense = drivingLicense;
            this.sex = sex;
        }

        public Ludzie(String name, int age, float height, char sex, String occupation, boolean drivingLicense) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.sex = sex;
            this.occupation = occupation;
            this.drivingLicense = drivingLicense;
        }

        public Ludzie(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Ludzie(String name, String occupation, char sex) {
            this.name = name;
            this.occupation = occupation;
            this.sex = sex;
        }
    }
}
