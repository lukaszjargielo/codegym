package pl.codegym.task.task15.task1503;

/* 
OOP: samochody
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuryCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.GeoMetro().printlnDesire();
    }

    public static class Ferrari extends LuxuryCar{
        public void printlnDesire() {
            //tutaj wpisz swój kod
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class GeoMetro extends CheapCar {
        public void printlnDesire() {
            //tutaj wpisz swój kod
            System.out.println(Constants.WANT_STRING + Constants.GEO_METRO_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Chcę prowadzić ";
        public static String LUXURY_CAR = "luksusowy samochód";
        public static String CHEAP_CAR = "tani samochód";
        public static String FERRARI_NAME = "Ferrari";
        public static String GEO_METRO_NAME = "Geo Metro";
    }

    public static class LuxuryCar {

        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURY_CAR);
        }

    }

    public static class CheapCar {

        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }

    }
}
