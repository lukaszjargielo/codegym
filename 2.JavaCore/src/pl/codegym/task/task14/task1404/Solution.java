package pl.codegym.task.task14.task1404;

/* 
Koty
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name;
        do {
            name = reader.readLine();
            if(!name.equals("")) {
                Cat cat = CatFactory.getCatByKey(name);
                System.out.println(cat.toString());
            }
        } while (!name.equals(""));


    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "dziki":
                    cat = new MeanCat("Pazur");
                    break;
                case "mańka":
                    cat = new NiceCat("Mania");
                    break;
                case "kafel":
                    cat = new NiceCat("Kafelek");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {

            this.name = name;
        }

        public String getName() {

            return this.name;
        }

        public String toString() {

            return "Jestem " + getName() + ", podwórkowy kocur";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {

            super(name);
        }

        public String toString() {

            return "Jestem " + getName() + ", zaraz wydrapię Ci oczy";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {

            super(name);
        }

        public String toString() {

            return "Jestem miłą kotką o imieniu " + getName();
        }
    }
}
