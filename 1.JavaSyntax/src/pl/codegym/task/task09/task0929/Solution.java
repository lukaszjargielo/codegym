package pl.codegym.task.task09.task0929;

import java.io.*;

/* 
Sprawmy, by kod robił coś pożytecznego!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String plikZrodlowyNazwa = reader.readLine();

        InputStream plikStrumienWejsciowy = null;
        OutputStream plikStrumienWyjsciowy = null;

        String plikDocelowyNazwa;
        try {

            plikStrumienWejsciowy = getInputStream(plikZrodlowyNazwa);
            plikDocelowyNazwa = reader.readLine();
            plikStrumienWyjsciowy = getOutputStream(plikDocelowyNazwa);

            while (plikStrumienWejsciowy.available() > 0) {
                int dane = plikStrumienWejsciowy.read();
                plikStrumienWyjsciowy.write(dane);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Plik nie istnieje.");

            plikZrodlowyNazwa = reader.readLine();
            plikDocelowyNazwa = reader.readLine();

            plikStrumienWejsciowy = getInputStream(plikZrodlowyNazwa);
            plikStrumienWyjsciowy = getOutputStream(plikDocelowyNazwa);

            while (plikStrumienWejsciowy.available() > 0) {
                int dane = plikStrumienWejsciowy.read();
                plikStrumienWyjsciowy.write(dane);
            }


        } finally {

            plikStrumienWejsciowy.close();
            plikStrumienWyjsciowy.close();
        }


    }

    public static InputStream getInputStream(String nazwaPliku) throws IOException {
        return new FileInputStream(nazwaPliku);
    }

    public static OutputStream getOutputStream(String nazwaPliku) throws IOException {
        return new FileOutputStream(nazwaPliku);
    }
}

