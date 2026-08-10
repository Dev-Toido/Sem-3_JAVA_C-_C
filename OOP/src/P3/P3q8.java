import java.util.Scanner;

public class P3q8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("The prime numbers are : ");
        for(int n=1;n<=num;n++){
            int factCount = 0;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    factCount++;
                }
            }
            System.out.print(((factCount == 0) ? n+" " : ""));
        }

    }
}
