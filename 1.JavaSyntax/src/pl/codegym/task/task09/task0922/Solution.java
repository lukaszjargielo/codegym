package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod

//        Date date = new Date();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            SimpleDateFormat dfIn = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            SimpleDateFormat dfOut = new SimpleDateFormat("d MM yyyy", new Locale("pl"));
            String s = reader.readLine();
            Date date = dfIn.parse(s);
            System.out.println(dfOut.format(date).toUpperCase());
//            System.out.println(date);
//            String[] arr = s.split("-");
//            int year = Integer.parseInt(arr[0]);
//            int month = Integer.parseInt(arr[1]) - 1;
//            int day = Integer.parseInt(arr[2]);
//            Calendar calendar = new GregorianCalendar(yearmonth,day);
//            date = calendar.getTime();

//            for (String s1 : arr) {
//                System.out.println(s1);
//            }

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    String dateIn = reader.readLine();
//
//    SimpleDateFormat sdfIn = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//
//    Date dateOut = sdfIn.parse(dateIn);
//
//    SimpleDateFormat sdfOut = new SimpleDateFormat("d MMM yyyy", new Locale("pl"));
//
//        System.out.println(sdfOut.format(dateOut).toUpperCase());
//}
//}
