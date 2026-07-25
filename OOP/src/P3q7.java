import java.util.Scanner;

public class P3q7 {
    public static long factorial(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        return n*factorial(n-1);
    }
    public static long c(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print(c(i,j)+" ");
            }
            System.out.println();
        }
    }
}
