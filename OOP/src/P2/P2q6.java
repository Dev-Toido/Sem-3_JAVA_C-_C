import java.util.Scanner;

public class P2q6 {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = viv.nextInt();
        System.out.print("Enter your income(per month): ");
        int income = viv.nextInt();
        System.out.print("Enter your credit score: ");
        int creditScore = viv.nextInt();

        if (age >= 21 && age <= 60 && income >= 20000 && creditScore >= 650) {
            System.out.println("Loan Approved — Maximum Loan Amount: Rs" + 30 * income);
        } else {
            System.out.println("Loan disapproved");
        }

    }
}
