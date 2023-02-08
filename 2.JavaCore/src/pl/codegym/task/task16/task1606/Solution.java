package pl.codegym.task.task16.task1606;

import java.util.ArrayList;
import java.util.List;

/* 
Łączenie we właściwym czasie i we właściwym miejscu
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        secondThread.start();
        firstThread.join();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {

            super(name);
        }

        public void run() {

            printList(getList(20), getName());
        }
    }
}
