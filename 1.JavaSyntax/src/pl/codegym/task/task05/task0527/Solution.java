package pl.codegym.task.task05.task0527;

/* 
Tom i Jerry
*/

public class Solution {
    public static void main(String[] args) {
        Mysz jerryMysz = new Mysz("Jerry", 12, 5);

        //tutaj wpisz swój kod

        Kot tomKot = new Kot("Tom", 120, 40);
        Pies spikePies = new Pies("Spike", 210, 10);
    }

    public static class Mysz {

        String imie;
        int wzrost;
        int ogon;

        public Mysz(String imie, int wzrost, int ogon) {
            this.imie = imie;
            this.wzrost = wzrost;
            this.ogon = ogon;
        }
    }

    //tutaj wpisz swój kod

    public static class Kot {
        private String imie;
        private int wzrost;
        private int ogon;

        public Kot(String imie, int wzrost, int ogon) {
            this.imie = imie;
            this.wzrost = wzrost;
            this.ogon = ogon;
        }

    }

    public static class Pies {
        private String imie;
        private int wzrost;
        private int ogon;

        public Pies(String imie, int wzrost, int ogon) {
            this.imie = imie;
            this.wzrost = wzrost;
            this.ogon = ogon;
        }
    }
}
