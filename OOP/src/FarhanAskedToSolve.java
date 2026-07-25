import java.util.Scanner;

//Sample Input
//Enter number of rows: 5
//Sample Output
//        *                         * * * * *
//        * *                       * * * *
//        * * *                     * * *
//        * * * *                   * *
//        * * * * *                 *
public class FarhanAskedToSolve {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1 || j==1 || i==5  || (i==3 && (j==4 || j==5)) || (j==5 && i==4)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            for (int j = 1; j <= n; j++) {
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            for (int j = 1; j <= n; j++) {
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            for (int j = 1; j <= n; j++) {
                if(i==1 || j==1 || i==5  || (i==3 && (j==4 || j==5)) || (j==5 && i==4)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            for (int j = 1; j <= n; j++) {
                if(i==5 || j==1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            for (int j = 1; j <= n; j++) {
                if(i==1 || i==3 || i==5 || j==1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
