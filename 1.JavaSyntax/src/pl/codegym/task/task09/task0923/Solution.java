package pl.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Samogłoski i spółgłoski
*/

public class Solution {
    public static char[] samogloski = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] input = s.toCharArray();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for (char in : input) {

            if (isSamogloska(in) && in != ' ') {
                vowels.add(in);
            } else if (!isSamogloska(in)  && in != ' '){
                consonants.add(in);
            }
        }

        for (char a : vowels) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (char b : consonants) {
            System.out.print(b + " ");
        }
    }

    // Ta metoda sprawdza, czy litera jest samogłoską
    public static boolean isSamogloska(char c) {
        c = Character.toLowerCase(c);  // Konwertuje na małe litery

        for (char d : samogloski)   // Szuka samogłosek w tablicy
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}