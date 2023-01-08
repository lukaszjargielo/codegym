package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        SimpleDateFormat dfIn = new SimpleDateFormat("yyyy-MM-dd"); /*, Locale.ENGLISH);*/
        SimpleDateFormat dfOut = new SimpleDateFormat("d MMM yyyy", new Locale("pl"));

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine();
            Date date = dfIn.parse(s);
            System.out.println(dfOut.format(date).toUpperCase());
//
        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}


