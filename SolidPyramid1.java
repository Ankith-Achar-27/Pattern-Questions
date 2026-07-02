/*

        *
       ***
      *****
     *******
    *********

*/

public class Pattern8 {
    public static void main(String[] args) {
        for (int row=1;row<=5;row++){
            //add spaces
            for (int space=1;space<=5-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*row-1);col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
