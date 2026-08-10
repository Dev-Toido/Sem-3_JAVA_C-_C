import java.util.Scanner;

public class P3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long factorial = 1;

        for (int i = 2; i <= n; i++) factorial *= i;

        System.out.println("Factorial of "+n+" = "+factorial);
    }
}
