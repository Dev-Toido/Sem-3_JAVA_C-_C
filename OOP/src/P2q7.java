
import java.util.Scanner;

public class P2q7 {
    public static void main(String[] dog) {
        Scanner viv = new Scanner(System.in);

        double billAmount = 0;
        boolean hasCoupon = false;

        System.out.print("Enter the bill amount: ");
        billAmount = viv.nextDouble();
        System.out.print("Enter the coupon amount: ");
        hasCoupon = viv.nextBoolean();

        double discount = billAmount > (double)1000.0F ? 0.2 : (billAmount > (double)500.0F ? 0.1 : 0);
        System.out.println("Base Discount = " + discount * (double)100.0F + " %");

        if (hasCoupon) {
            System.out.println("Coupon Discount = 5 %");
            discount += 0.05;
        }

        System.out.println("Final Amount = Rs" + (billAmount - discount * billAmount));
    }
}
