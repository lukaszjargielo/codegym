package pl.codegym.task.task13.task1323;

/* 
Interfejs Updatable w klasie Screen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{

        @Override
        public void onSelect() {
            System.out.println("The following options are available.");
        }

        @Override
        public void refresh() {
            System.out.println("The content has been refreshed");

        }
    }
}
