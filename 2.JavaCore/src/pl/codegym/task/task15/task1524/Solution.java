package pl.codegym.task.task15.task1524;

/* 
Kolejność ładowania zmiennych
*/

public class Solution {
    static {
        init(); //
        System.out.println("Blok statyczny");
    }

    {
        System.out.println("Blok niestatyczny");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "Imię";
//    static {
//        init();
//    }

    public Solution() {
        System.out.println("Konstruktor Solution");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
