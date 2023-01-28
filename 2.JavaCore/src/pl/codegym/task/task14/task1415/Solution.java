package pl.codegym.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Usługi sprzątające
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // Napisz tutaj swoją implementację Punktów 1-4
        for (Apartment ap : apartments) {
            if(ap instanceof OneRoomApt) {
                OneRoomApt oneRoomApt = (OneRoomApt) ap;
                oneRoomApt.clean1Room();
            }
            if(ap instanceof TwoRoomApt) {
                TwoRoomApt twoRoomApt = (TwoRoomApt) ap;
                twoRoomApt.clean2Rooms();
            }
            if(ap instanceof ThreeRoomApt) {
                ThreeRoomApt threeRoomApt = (ThreeRoomApt) ap;
                threeRoomApt.clean3Rooms();
            }
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("Posprzątano 1 pokój");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("Posprzątano 2 pokoje");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("Posprzątano 3 pokoje");
        }
    }
}
