import java.util.Scanner;

public class P2q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        int annualIncome = sc.nextInt();

        double helcess = 0;
        double tax = 0;
        if (annualIncome <= 250000) {
            tax = 0;
        } else if (annualIncome <= 500000) {
            tax = 0.05;
        } else if (annualIncome <= 1000000) {
            tax = 0.2;
        } else {
            tax = 0.3;
        }

        tax *= (double)annualIncome;
        helcess += tax * 0.04;

        System.out.println("Tax: Rs" + tax);
        System.out.println("Health Cess: Rs" + helcess);
        System.out.println("Total payable: Rs" + (tax + helcess));
    }
}
