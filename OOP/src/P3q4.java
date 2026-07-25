import java.util.Scanner;

public class P3q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int rn=0,dn = n;

        while(dn!=0){
            rn = rn * 10 + dn % 10;
            dn/=10;
        }
        System.out.println("Reverse of "+n+" is "+rn);
    }
}
