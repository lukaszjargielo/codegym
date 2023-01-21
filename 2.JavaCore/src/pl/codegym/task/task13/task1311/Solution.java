package pl.codegym.task.task13.task1311;

/* 
Zatrudnijmy tłumacza
*/

public class Solution {

    public static void main(String[] args) {
        RussianTranslator russianTranslator = new RussianTranslator();
        System.out.println(russianTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {

            return "Tłumaczę z " + getLanguage();
        }
    }

    public static class RussianTranslator extends Translator {

        @Override
        public String getLanguage() {
            return "rosyjskiego";
        }
    }
}