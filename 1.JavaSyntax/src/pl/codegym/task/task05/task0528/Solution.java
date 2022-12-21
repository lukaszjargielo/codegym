package pl.codegym.task.task05.task0528;

/* 
Wyświetl dzisiejszą datę
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
         Date date = new Date();
//        System.out.println(date );
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(dateFormat.format(date));
    }
}
