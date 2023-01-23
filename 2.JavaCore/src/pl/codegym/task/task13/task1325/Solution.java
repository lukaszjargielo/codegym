package pl.codegym.task.task13.task1325;

import java.awt.*;

/* 
Kompilowanie programu
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }


    }

    public /*abstract*/ static class BigFox extends Fox {

        @Override
        public Color getColor() {
            return Color.RED;
        }
    }

}
