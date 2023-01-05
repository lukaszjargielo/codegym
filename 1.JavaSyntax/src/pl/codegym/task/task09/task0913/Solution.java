package pl.codegym.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Wyjątki. Po prostu wyjątki.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        try {

            method1(); //
            //tutaj wpisz swój kod

        } catch (NullPointerException e) {

        } catch (FileNotFoundException e) {
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        }
        if (i == 1) {
            throw new ArithmeticException();
        }
        if (i == 2) {
            throw new FileNotFoundException();
        }
        if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
