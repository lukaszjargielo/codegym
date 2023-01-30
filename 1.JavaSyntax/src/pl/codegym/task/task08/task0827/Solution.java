package pl.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDataNieparzysta("MAY 1 2013"));
        System.out.println(isDataNieparzysta("JANUARY 1 2013"));
        System.out.println(isDataNieparzysta("JANUARY 2 2013"));

    }

    public static boolean isDataNieparzysta(String date) throws ParseException {

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
                isOdd = true;
            } else {
                isOdd = false;
            }
            return isOdd;
        }
    }
}