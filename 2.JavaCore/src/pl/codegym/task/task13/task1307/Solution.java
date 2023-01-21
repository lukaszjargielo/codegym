package pl.codegym.task.task13.task1307;

/* 
Parametryzowany interfejs
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> //tutaj wpisz swój kod
    {
        @Override
        public SimpleObject<String> getInstance() {
            return this::getInstance;
        }
    }
}
