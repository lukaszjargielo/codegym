package pl.codegym.task.task07.task0723;

/* 
Odliczanie
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //tutaj wpisz swój kod
            Thread.sleep(100);
        }

        System.out.println("Bum!");
    }
}
