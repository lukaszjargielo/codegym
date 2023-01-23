package pl.codegym.task.task13.task1321;


/* 
Naprawianie błędów
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream /*implements Hobby*/extends Desire {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby /*extends*/implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}