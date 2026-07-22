import java.util.Scanner;

public class P2q5 {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);

        System.out.print("Enter your bank balance: ");
        double balance = viv.nextDouble();
        System.out.print("Enter your withdrawal amount(must be multiple of 100): ");
        double withdraw = viv.nextDouble();

        if (balance > withdraw && balance > 0 && balance % 100.0 == 0 && balance - withdraw >= 1000) {
            balance -= withdraw;
            System.out.println("Transaction successfully!!");
            System.out.println("Your bank balance = " + balance);
        } else {
            System.out.println("Transaction failed!!");
            System.out.println("Please enter a valid amount!!");
        }

    }
}
