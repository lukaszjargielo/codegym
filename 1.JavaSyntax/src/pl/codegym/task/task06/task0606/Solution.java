package pl.codegym.task.task06.task0606;

import java.io.*;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String number = reader.readLine();
            if (!number.equals("0")) {
                for (int i = 0; i < number.length(); i++) {
                    int j = Character.digit(number.charAt(i), 10);
                    if (j % 2 == 0) {
                        parzyste++;
                    } else {
                        nieparzyste++;
                    }

                }
                System.out.println("Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste);
                break;
            }
        }
    }
}
