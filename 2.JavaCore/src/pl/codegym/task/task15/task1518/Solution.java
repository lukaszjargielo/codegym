package pl.codegym.task.task15.task1518;

/* 
Modyfikatory statyczne i kociaki
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Tiger";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
    public static class Cat {
        public String name;
    }
}
