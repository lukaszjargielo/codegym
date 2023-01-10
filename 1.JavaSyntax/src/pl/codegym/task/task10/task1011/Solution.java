package pl.codegym.task.task10.task1011;

/* 
Dużo pieniędzy
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Wcale nie chcę uczyć się Javy. Chcę tylko dużo pieniędzy";

        //tutaj wpisz swój kod
        char[] sentenceArray = s.toCharArray();
        for (int i = 0; i < 48; i++) {
            for (int j = i; j < sentenceArray.length; j++) {
                System.out.print(sentenceArray[j]);
            }
            System.out.println();
        }
    }

}

