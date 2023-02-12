package pl.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Modyfikatory statyczne: część 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.0,"Jeden kropka zero");
        labels.put(2.0,"Dwa kropka zero");
        labels.put(3.0,"Trzy kropka zero");
        labels.put(4.0,"Cztery kropka zero");
        labels.put(5.0,"Pięć kropka zero");
    }

    public static void main(String[] args) {

        System.out.println(labels);

    }
}
