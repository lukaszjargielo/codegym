package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args) {

        czytajDane();
    }

    public static void czytajDane() {
        //tutaj wpisz swój kod
        ArrayList<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (;;) {
                int number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        } catch (NumberFormatException | IOException e) {
//            e.printStackTrace();
            for (int x : list) {
                System.out.println(x);
            }
        }

    }
}
