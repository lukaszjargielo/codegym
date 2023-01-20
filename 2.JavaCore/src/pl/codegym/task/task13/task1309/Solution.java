package pl.codegym.task.task13.task1309;

/* 
Wszystko, co się porusza
*/

public class Solution {
    public static void main(String[] args) {
    }

    interface CanMove {
        Double speed ();
    }

    interface CanFly extends CanMove{
        Double speed (CanFly cf);
    }
}