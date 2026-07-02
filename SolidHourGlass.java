public class Pattern12 {
    public static void main(String[] args) {
        int num = 10;
        for(int row=1;row<=num/2;row++){
            for (int space=1;space<row;space++){
                System.out.print(" ");
            }
            for (int col=1;col<=(num/2-row)+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row=2;row<=num/2;row++){
            for (int space=0;space<num/2-row;space++){
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
