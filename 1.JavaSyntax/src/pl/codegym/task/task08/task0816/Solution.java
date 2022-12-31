package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();
        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));


        //tutaj wpisz swój kod
        mapa.put("Lee", df.parse("LIPIEC 2 1976"));
        mapa.put("Schwarzenegger", df.parse("STYCZEŃ 1 2000"));
        mapa.put("Willis", df.parse("LUTY 18 2006"));
        mapa.put("Watson", df.parse("MARZEC 4 1988"));
        mapa.put("Cloney", df.parse("KWIECIEŃ 21 1937"));
        mapa.put("Radcliff", df.parse("MAJ 31 2011"));
        mapa.put("Rubik", df.parse("CZERWIEC 8 1947"));
        mapa.put("Janda", df.parse("LIPIEC 13 2001"));
        mapa.put("Bończyk", df.parse("SIERPIEŃ 2 1888"));
        return mapa;
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        //tutaj wpisz swój kod
        Calendar calendar = new GregorianCalendar();
        Iterator<Map.Entry<String, Date>> iter = mapa.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Date> para = iter.next();
            Date value = para.getValue();
            calendar.setTime(value);
           int month = calendar.get(Calendar.MONTH);
           switch (month) {
               case 5:
               case 6:
               case 7: {
                   iter.remove();
                   break;
               }


           }

        }

    }

    public static void main(String[] args) throws ParseException {
//        HashMap <String, Date> map = Solution.utworzMap();
//        Solution.usunUrodzonychLatem(map);
//        System.out.println(map);


    }
}
