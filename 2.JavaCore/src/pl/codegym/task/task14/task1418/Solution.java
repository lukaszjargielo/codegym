package pl.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Napraw cztery błędy
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();

    }

    public static void initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    public static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void processCastObjects(List<Number> list) {
        for (Number object : list) {

            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Czy zdefiniowano float? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Czy double jest nieskończony? " + a.isInfinite());
            }
        }
    }
}
