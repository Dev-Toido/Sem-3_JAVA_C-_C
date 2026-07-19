
public class P2Q1 {
    public static void main(String[] args) {
        int m1 = 56, m2 = 5, m3 = 5, m4 = 5, m5 = 65;
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500.0) * 100.0;
        System.out.println("Total is " + total);
        System.out.println("Percentage is " + percentage);
        System.out.println("Result is " + ((percentage >= 40.0) ? "Passed" : "Failed"));
    }
}
