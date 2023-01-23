package pl.codegym.task.task13.task1324;

import java.awt.*;

/* 
Jedna metoda w klasie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
       default Color getColor() {
        return Color.RED;
       }

        default Integer getAge() {
           return this.getAge();
        }
    }

    public static class Fox implements Animal{

        public String getName() {

            return "Fox";
        }
    }
}
