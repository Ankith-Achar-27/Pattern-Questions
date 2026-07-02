/*

     *********
      *******
       *****
        ***
         *

*/

public class InvertedSolidPyramid1 {
    public static void main(String[] args) {
        int num = 5;
        for (int row=1;row<=num;row++){
            //add spaces
            for (int space=1;space<row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<= (2 * num - 1) - 2 * (row - 1);col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
