package pl.codegym.task.task03.task0313;

/* 
Ala ma kota
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        String s1 = "Ala";
        String s2 = "ma";
        String s3 = "kota";

        String arr[] = {"Ala", "ma", "kota"};
        int innerCount = 0;
        int outerCount = 0;
        while (outerCount <= 6) {
                int a = (int) Math.floor(Math.random() * 3);
                int b = (int) Math.floor(Math.random() * 3);
                int c = (int) Math.floor(Math.random() * 3);
                if ((a != b) & (b != c) & (c != a)) {
                    System.out.println(arr[a]+arr[b]+arr[c]);
                }

//            String comb = arr[numOfWord] +
        }
        System.out.println(s1 + s2 + s3);
        System.out.println(s1 + s3 + s2);
        System.out.println(s2 + s1 + s3);
        System.out.println(s2 + s3 + s1);
        System.out.println(s3 + s1 + s2);
        System.out.println(s3 + s2 + s1);


    }
}
