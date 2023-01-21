package pl.codegym.task.task13.task1312;

/* 
Kod sam się nie poprawi
*/

public class Solution {

    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public /*abstract*/ static class Translator {

        public String translate() {

            return "Tłumaczę z rosyjskiego";
        }
    }
}