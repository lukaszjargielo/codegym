package pl.codegym.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Wczytywanie pliku
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String sourceFileName = reader.readLine();
//        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
//
//        Scanner scanner = new Scanner(fileInputStream);
//        StringBuilder builder = new StringBuilder();
//
//        while (scanner.hasNextLine()) {
//            builder.append(scanner.nextLine()).append("\n");
//        }
//
//        System.out.print(builder.toString());
//
//        scanner.close();
//        reader.close();
//    }
//    }
//        // tutaj wpisz swój kod
//POWRÓT DO ZADANIA PO PRZERWIE
              }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();


        FileInputStream fis = new FileInputStream(fileName);

        int i;

//        while (fis.available() > 0) {
//            i = fis.read();
        while ((i = fis.read()) != -1) {
            System.out.print(String.valueOf((char) i));
        }
        reader.close();
        fis.close();
    }
}
