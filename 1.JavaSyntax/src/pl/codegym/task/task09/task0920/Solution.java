package pl.codegym.task.task09.task0920;

/* 
Odliczanie
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //tutaj wpisz swój kod
        }
    }
}