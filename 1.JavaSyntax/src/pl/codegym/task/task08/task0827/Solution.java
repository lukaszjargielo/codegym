package pl.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
//        String date = "MAY 1 2013";
//        Date date2 = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(date);
//
//        Calendar calendarIn = Calendar.getInstance();
//        calendarIn.setTime(date2);
//        System.out.println(date2);
//
//        int mount = calendarIn.get(Calendar.MONTH);
//        int day = calendarIn.get(Calendar.DAY_OF_MONTH);
//        int year = calendarIn.get(Calendar.YEAR);
//
//        Calendar calendarGregorianIn = new GregorianCalendar(year,mount,day);
//        calendarGregorianIn.isLeap
//        System.out.println(calendarGregorianIn);
//        Calendar calendarGregorianStart = new GregorianCalendar(year,0,1);
//        System.out.println(calendarGregorianStart);
//
//        long milisCalendarGregorianIn = calendarGregorianIn.getTimeInMillis();
//        System.out.println(milisCalendarGregorianIn);
//        long milisCalendarGregorianStart = calendarGregorianStart.getTimeInMillis();
//        System.out.println(milisCalendarGregorianStart);
//
//        long result = milisCalendarGregorianIn - milisCalendarGregorianStart;
//        System.out.println(result);
//        long dayInMilis = 1 * 60 * 60* 24 *1000;
//        System.out.println(dayInMilis);
//        long days = result/dayInMilis;
//        System.out.println(days);
//
//        if(days % 2 == 0) {
//            return false;
//        } else {
//            return true;
//        }
////        String date1 = "MAY 1 2013";
////        String date2 = date1.toLowerCase();
//        Date date3 = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(date1);
//        System.out.println(date3);
////        String dateToLowerCase = date.toLowerCase();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy");
////        Date date1 = simpleDateFormat.parse(dateToLowerCase);
//        Calendar calendar = new GregorianCalendar();
////        System.out.println(calendar.setTime(date1));

        System.out.println(isDataNieparzysta("MAY 1 2013"));
    }

    public static boolean isDataNieparzysta(String date) throws ParseException {

        Date date2 = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(date);

        Calendar calendarIn = Calendar.getInstance();
        calendarIn.setTime(date2);
        System.out.println(date2);

        int mount = calendarIn.get(Calendar.MONTH);
        int day = calendarIn.get(Calendar.DAY_OF_MONTH);
        int year = calendarIn.get(Calendar.YEAR);

        Calendar calendarGregorianIn = new GregorianCalendar(year,mount,day);
        System.out.println(calendarGregorianIn);
        Calendar calendarGregorianStart = new GregorianCalendar(year,0,1);
        System.out.println(calendarGregorianStart);

        long milisCalendarGregorianIn = calendarGregorianIn.getTimeInMillis();
        System.out.println(milisCalendarGregorianIn);
        long milisCalendarGregorianStart = calendarGregorianStart.getTimeInMillis();
        System.out.println(milisCalendarGregorianStart);

        long result = milisCalendarGregorianIn - milisCalendarGregorianStart;
        System.out.println(result);
        long dayInMilis = 1 * 60 * 60* 24 *1000;
        System.out.println(dayInMilis);
        long days = result/dayInMilis;
        System.out.println(days);

        if(days % 2 == 0) {
            return false;
        } else {
            return true;
        }
////

//        Scanner scanner = new Scanner(date).useDelimiter(" ");
//        String month = scanner.next();
//        int day = scanner.nextInt();
//        int year = scanner.nextInt();
////        switch (month) {
////            case "JANUARY"
////        }
//        calendar.set(Calendar.YEAR, year);
//        calendar.set(Calendar.DAY_OF_MONTH, day);
////        calendar.set();
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy");
////        Date date1 = simpleDateFormat.parse(dateToLowerCase);
////        calendar.setTime(date1);


    }
}