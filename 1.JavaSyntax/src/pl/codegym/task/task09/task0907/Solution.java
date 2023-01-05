package pl.codegym.task.task09.task0907;

/* 
Korzystanie z wyjątków przy pracy z liczbami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        try {

            int a = 42 / 0; //to było, a cała reszta to mój kod

        } catch (ArithmeticException e) {
            //tutaj wpisz swój kod
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
            System.out.println(e.getClass());
        }
    }
}
