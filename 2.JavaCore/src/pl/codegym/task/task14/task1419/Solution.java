package pl.codegym.task.task14.task1419;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* 
Inwazja wyjątków
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // Pierwszy wyjątek
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        //tutaj wpisz swój kod
        try {
            int[] arr = new int[0];
            int x = arr[0];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayStoreException();
//            int[] arr = new int[1];
//            arr[0] = "String";
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalAccessException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ConcurrentModificationException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }
//        try {
//          String s = "1";
//            int x  = (int) s;
//        } catch (Exception e) {
//            exceptions.add(e);
//        }
//        try {
//            int[] arr = new int[1];
//            int x = arr[-1];
//        } catch (Exception e) {
//            exceptions.add(e);
//        }


    }
}
