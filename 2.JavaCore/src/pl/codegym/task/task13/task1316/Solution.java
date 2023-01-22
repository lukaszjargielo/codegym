package pl.codegym.task.task13.task1316;

/* 
Niepoprawne linie
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Zatwierdź";

//        public void onPress();

//        protected void onPress();

//        void onPress();

//        private void onPress();

        /*protected String onPress(Object o);*/

        String onPress(Object o);

       /* private String onPress(Object o);*/
    }
}