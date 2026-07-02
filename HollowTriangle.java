public class HollowTriangle {
    public static void main(String[] args) {
        int n=10;
        for (int row=1;row<=n;row++){
            // Spaces
            for (int space=1;space<=(n-row);space++){
                System.out.print(" ");
            }

            // Stars
            for (int col=1;col<=(2*row-1);col++){
                if(col == 1 || col==(2*row-1) || row==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}