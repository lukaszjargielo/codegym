package pl.codegym.task.task09.task0925;

/* 
Modyfikatory statyczne są nie na miejscu
*/

public class Solution {
    public static int A = 5; //
    public static int B = 2 * A; //
    public int C = A * B;
    public static int D = A * B; //

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA() {

        return A;
    }

}
