package pl.codegym.task.task09.task0918;

/* 
Wszyscy są naszymi kumplami, nawet wyjątki
*/

import java.io.IOException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends IllegalArgumentException {
    }

    static class MyException2 extends NullPointerException {
    }

    static class MyException3 extends IOException {
    }

    static class MyException4 extends SocketException {
    }
}

