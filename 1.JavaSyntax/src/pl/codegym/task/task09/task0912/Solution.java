package pl.codegym.task.task09.task0912;

/* 
Korzystanie z wyjątków przy pracy z liczbami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        try {

            int num = Integer.parseInt("XYZ"); //
            System.out.println(num); //
            //tutaj wpisz swój kod

        } catch (NumberFormatException e) {
            System.out.println(e.getClass());
        }
    }
}
