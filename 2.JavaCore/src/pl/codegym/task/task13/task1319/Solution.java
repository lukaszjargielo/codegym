package pl.codegym.task.task13.task1319;

import java.io.*;

/* 
Zapisywanie do pliku z konsoli
*/

public class Solution {
    public static void main(String[] args) {
        // tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            File file = new File(fileName);

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            String line;
            boolean isOn = true;
            while(isOn) {
                line = reader.readLine();
                writer.write(line + "\n");
                if(line.equals("exit")) {
                    isOn = false;
                }
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
