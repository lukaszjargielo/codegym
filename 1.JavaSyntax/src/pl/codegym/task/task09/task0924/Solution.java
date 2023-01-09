package pl.codegym.task.task09.task0924;

import java.util.ArrayList;

/* 
Straszna opowieść
*/

public class Solution {
    public static CzerwonyKapturek kapturek = new CzerwonyKapturek();
    public static Babcia babcia = new Babcia();
    public static Ciasto ciasto = new Ciasto();
    public static Drwal drwal = new Drwal();
    public static Wilk wilk = new Wilk();

    public static void main(String[] args) {
        // tutaj wpisz swój kod
        wilk.zjadl.add(babcia);
        wilk.zjadl.add(kapturek);
//        wilk.zjadl.add(ciasto);
        drwal.zabil.add(wilk);
    }

    // Czerwony kapturek
    public static class CzerwonyKapturek extends ElementHistorii {
    }

    // Babcia
    public static class Babcia extends ElementHistorii {
    }

    // Ciasto
    public static class Ciasto extends ElementHistorii {
    }

    // Drwal
    public static class Drwal extends ElementHistorii {
    }

    // Wilk
    public static class Wilk extends ElementHistorii {
    }

    public static abstract class ElementHistorii {
        public ArrayList<ElementHistorii> zabil = new ArrayList<>();
        public ArrayList<ElementHistorii> zjadl = new ArrayList<>();
    }
}
