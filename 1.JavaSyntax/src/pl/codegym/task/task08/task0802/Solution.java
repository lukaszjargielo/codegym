package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        HashMap<String, String> map = new HashMap<>();
        map.put("arbuz", "melon");
        map.put("banan", "owoc");
        map.put("wiśnia", "owoc");
        map.put("gruszka", "owoc");
        map.put("kantalupa", "melon");
        map.put("jeżyna", "owoc");
        map.put("żeńszeń", "korzeń");
        map.put("truskawka", "owoc");
        map.put("irys", "kwiat");
        map.put("ziemniak", "bulwa");

        for (Map.Entry<String,String> para : map.entrySet()) {
            String key = para.getKey();
            String value = para.getValue();
            System.out.println(key + " - " + value);

        }
    }
}
