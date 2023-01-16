package pl.codegym.task.task12.task1224;

/* 
Nieznane zwierzę
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //tutaj wpisz swój kod
        String s = o.getClass().getSimpleName();
        switch (s) {
            case "Cat":
            case "Tiger":
            case "Lion":
            case "Bull": {

                return s;
            }
            default:
                return "Animal";

        }

    }


    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
