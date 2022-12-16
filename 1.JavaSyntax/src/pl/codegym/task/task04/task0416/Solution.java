package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double numOfMin = Double.parseDouble(reader.readLine());
        double numOfSec = numOfMin * 60;
        double result  = numOfSec / 300 - (int)numOfSec / 300;
        if(result >= 0.0 && result < 0.6){
            System.out.println("zielone");
        } else if (result >= 0.6 && result < 0.8) {
            System.out.println("żółte");
        } else {
            System.out.println("czerwone");
        }

    }
}
