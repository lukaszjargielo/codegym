package pl.codegym.task.task14.task1409;

/* 
Mosty
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    // Tutaj dodaj metodę println
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}

