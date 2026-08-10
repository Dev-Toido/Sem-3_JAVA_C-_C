import java.util.Scanner;

public class P2q8 {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);

        double usdAmount,exchangeRate,result;
        System.out.println("Welcome to the USD to INR converter!!");
        System.out.print("Please enter your USD amount:");
        usdAmount = viv.nextDouble();
        System.out.print("Please enter your exchange rate:");
        exchangeRate = viv.nextDouble();

        result = usdAmount * exchangeRate;
        System.out.println("double result = Rs." + result);
        System.out.println("int result = Rs."+(int)result);
        System.out.println("Loss = Rs."+(result-(int)result));
    }
}
