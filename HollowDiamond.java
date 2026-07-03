public class HollowDiamond {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
//            spaces
            for (int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*row-1);col++){
                if(col==1 || col == (2*row-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int row=n-1;row>=1;row--){
//            spaces
            for (int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=(2*row-1);col++){
                if(col==(2*row-1) || col == 1){
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
