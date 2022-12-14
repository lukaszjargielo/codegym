package pl.codegym.task.task04.task0411;

/* 
Pory Roku na Terze
*/

public class Solution {
    public static void main(String[] args) {
        sprawdzPoreRoku(12);
        sprawdzPoreRoku(4);
        sprawdzPoreRoku(7);
        sprawdzPoreRoku(10);
    }

    public static void sprawdzPoreRoku(int miesiac) {
        //tutaj wpisz swój kod
        switch (miesiac) {
            case 12:
            case 1:
            case 2: {
                System.out.println("zima");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("wiosna");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("lato");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("jesień");
                break;
            }
        }
    }
}