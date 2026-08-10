import java.util.Scanner;

public class P3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i+=2) {
            System.out.print(i + " ");
        }
    }
}
