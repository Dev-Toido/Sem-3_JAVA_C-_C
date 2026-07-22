public class P2q3 {
    public static void main(String[] args) {
        int previousReading = 1200;
        int currentReading = 1450;
        int units = currentReading - previousReading;

        int bill = 50;

        if (units <= 100) {
            bill += units * 3;
        } else if (units <= 200) {
            bill += 300 + (units - 100) * 5;
        } else {
            bill += 800 + (units - 200) * 8;
        }

        System.out.println("The units consumed = " + units);
        System.out.println("The total bill = " + bill);
    }
}
