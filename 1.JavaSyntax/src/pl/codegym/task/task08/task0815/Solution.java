package pl.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, String> surnamesAndNames = new HashMap<>();
        surnamesAndNames.put("Kowalski", "Jan");
        surnamesAndNames.put("Żyłowski", "Wiesław");
        surnamesAndNames.put("Machulec", "Jan");
        surnamesAndNames.put("Kretyn", "Bogdan");
        surnamesAndNames.put("Mazgaj", "Filip");
        surnamesAndNames.put("Fiut", "Jerzy");
        surnamesAndNames.put("Hensel", "Jerzy");
        surnamesAndNames.put("Biela", "Piotr");
        surnamesAndNames.put("Kurpanik", "Filip");
        surnamesAndNames.put("Mirecki", "Willi");
        return surnamesAndNames;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        //tutaj wpisz swój kod
        int namesCounter = 0;
        for (String s : map.values()) {
            if (s.equals(imie)) {
                namesCounter++;
            }


        }
        return namesCounter;
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        //tutaj wpisz swój kod
        int surnamesCounter = 0;
            for (String s : map.keySet()) {
                if(s.equals(nazwisko)) {
                    surnamesCounter++;

                }
            }
            return surnamesCounter;
    }

    public static void main(String[] args) {

    }
}
