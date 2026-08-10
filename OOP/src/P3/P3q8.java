import java.util.Scanner;

public class P3q8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factCount = 0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                factCount++;
            }
        }
        System.out.println("The number "+n+" is "+((factCount==0)?"":"not ")+"prime.");

    }
}
