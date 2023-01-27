package pl.codegym.task.task14.task1408;

/* 
Ferma drobiu
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
//        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            //tutaj wpisz swój kod
            switch (continent) {
                case "Europa":
                    hen = new EuropeanHen();
                    break;
                case "Ameryka Północna":
                    hen = new NorthAmericanHen();
                    break;
                case Continent.ASIA:
                    hen = new AsianHen();
                    break;
                case Continent.AFRICA:
                    hen = new AfricanHen();
                    break;
            }
            return hen;

        }
    }
}


