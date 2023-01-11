package pl.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static ArrayList<String>[] utworzList() {
        //tutaj wpisz swój kod

        ArrayList<String>[] array = new ArrayList[3];
        array[0] = new ArrayList<>();
        array[1] = new ArrayList<>();
        array[2] = new ArrayList<>();

        array[0].add("ArrayList1 and its content");
        array[1].add("ArrayList2 and its content");
        array[2].add("ArrayList3 and its content");
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        arrayList1.add("ArrayList1 and its content");
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList1.add("ArrayList2 and its content");
//        array[1] = arrayList2;
//
//        ArrayList<String> arrayList3 = new ArrayList<>();
//        arrayList1.add("ArrayList3 and its content");
//        array[2] = arrayList3;

        return array;

    }

    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}