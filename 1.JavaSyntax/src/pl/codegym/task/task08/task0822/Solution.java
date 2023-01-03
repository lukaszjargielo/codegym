package pl.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Najmniejsza z N liczb
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> listaLiczbCalkowitych = getListaLiczbCalkowitych();
        System.out.println(getMinimum(listaLiczbCalkowitych));

    }

    public static int getMinimum(List<Integer> array) {
        // Znajduje minimum
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getListaLiczbCalkowitych() throws IOException {
        // Tworzy i inicjalizuje listę
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(reader.readLine()));

        }
        return list;
    }
}
