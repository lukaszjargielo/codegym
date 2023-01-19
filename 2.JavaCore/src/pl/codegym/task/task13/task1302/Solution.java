package pl.codegym.task.task13.task1302;

/* 
Piwo. Część 2. Regeneracja.
*/

public class Solution {

    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink{

        @Override
        public boolean isAlcoholic() {
            return true;
        }

        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Napój alkoholowy";
            } else {
                return "Napój bezalkoholowy";
            }
        }
    }
}