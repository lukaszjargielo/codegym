package pl.codegym.task.task15.task1510;

/* 
Znikajcie, to wszystko jest niepotrzebne!
*/

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
//        add("1", 2d);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {

        System.out.println("Dodanie liczb całkowitych");
    }

    public static void add(int i, double j) {

        System.out.println("Dodanie liczby całkowitej i double");
    }

    public static void add(double i, double j) {

        System.out.println("Dodanie double");
    }
}
