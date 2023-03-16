package pl.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/* 
Wczytywanie pliku
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        FileInputStream fis = null;
        int i =0;

        try {
            fileName = reader.readLine();

            fis = new FileInputStream(fileName);

            while((i = fis.read()) != -1) {
                System.out.print((char) i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null) {
                reader.close();
            }
            if(fis != null) {
                fis.close();
            }

        }

    }
}