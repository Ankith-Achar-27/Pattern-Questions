/*

        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
*/

public class Pattern5 {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {

            int totalCols;

            if (row <= 5) {
                totalCols = row;
            } else {
                totalCols = 10 - row;
            }

            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
