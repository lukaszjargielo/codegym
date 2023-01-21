package pl.codegym.task.task13.task1313;

import java.awt.*;

/* 
Lis to zwierzę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default Color getColor() {
            return this.getColor();
        }
    }

    public static class Fox implements Animal{

        public String getName() {

            return "Fox";
        }
    }
}