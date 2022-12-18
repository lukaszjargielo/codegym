package pl.codegym.task.task04.task0443;


/* 
Imię to imię
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        int year = Integer.parseInt(reader.readLine());
        int mounth = Integer.parseInt(reader.readLine());
        int day = Integer.parseInt(reader.readLine());

        System.out.println("Mam na imię " +name + "." +
                "\nUrodziłem/am się " + mounth + "/" + day + "/" + year);

    }
}
