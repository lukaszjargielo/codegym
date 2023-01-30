package pl.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        String test1 = "JANUARY 1 2000";
        String test2 = "JANUARY 2 2020";
        String test3 = "JANUARY 3 2020";
        String test4 = "JANUARY 4 2020";
        String test5 = "FEBRUARY 28 2000";
        String test6 = "FEBRUARY 29 2000";
        String test7 = "MARCH 1 2000";

//        System.out.println(isDataNieparzysta("MAY 1 2013"));
//        System.out.println(isDataNieparzysta("JANUARY 1 2013"));
//        System.out.println(isDataNieparzysta(test1));
//        System.out.println(isDataNieparzysta(test2));

        Date date2 = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(test7);

        Calendar calendarIn = Calendar.getInstance();
        calendarIn.setTime(date2);
        System.out.println(date2);

        int mount = calendarIn.get(Calendar.MONTH);
        int day = calendarIn.get(Calendar.DAY_OF_MONTH);
        int year = calendarIn.get(Calendar.YEAR);

        Calendar calendarGregorianIn = new GregorianCalendar(year, mount, day);
        System.out.println(calendarGregorianIn);
        Calendar calendarGregorianStart = new GregorianCalendar(year, 0, 1);
        System.out.println(calendarGregorianStart);
        if (calendarGregorianIn.equals(calendarGregorianStart)) {
            System.out.println(true);
        } else {
            long milisCalendarGregorianIn = calendarGregorianIn.getTimeInMillis();
            System.out.println(milisCalendarGregorianIn);
            long milisCalendarGregorianStart = calendarGregorianStart.getTimeInMillis();
            System.out.println(milisCalendarGregorianStart);

            long result = milisCalendarGregorianIn - milisCalendarGregorianStart;
            System.out.println(result);
            long dayInMilis = 1 * 60 * 60 * 24 * 1000;
            long days = result / dayInMilis;
            System.out.println(days);
            boolean isOdd;

            if (days % 2 == 0) {
                isOdd = true;
            } else {
                isOdd = false;
            }
            System.out.println(isOdd);

        }
    }

    /*public static boolean isDataNieparzysta(String date) throws ParseException {

        Date date2 = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(date);

        Calendar calendarIn = Calendar.getInstance();
        calendarIn.setTime(date2);

        int mount = calendarIn.get(Calendar.MONTH);
        int day = calendarIn.get(Calendar.DAY_OF_MONTH);
        int year = calendarIn.get(Calendar.YEAR);

        Calendar calendarGregorianIn = new GregorianCalendar(year, mount, day);
        Calendar calendarGregorianStart = new GregorianCalendar(year, 0, 1);
        if (calendarGregorianIn.equals(calendarGregorianStart)) {
            return true;
        } else {
            long milisCalendarGregorianIn = calendarGregorianIn.getTimeInMillis();
            long milisCalendarGregorianStart = calendarGregorianStart.getTimeInMillis();

            long result = milisCalendarGregorianIn - milisCalendarGregorianStart;
            long dayInMilis = 1 * 60 * 60 * 24 * 1000;
            long days =  result / dayInMilis;
            boolean isOdd;

            if (days % 2 == 0) {
                isOdd = false;
            } else {
                isOdd = true;
            }
            return isOdd;
        }
    }*/
}