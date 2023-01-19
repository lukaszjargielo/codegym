package pl.codegym.task.task13.task1305;

/* 
Cztery błędy
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(/*new Dream().*//*Hobby*/Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        /*private*/public static Hobby HOBBY = new Hobby();
    }

    /**/static class Hobby /*extends Desire*/ implements Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
