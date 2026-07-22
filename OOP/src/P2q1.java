class P2q1 {
    public static void main(String[] args) {
        int m1 = 85;
        int m2 = 572;
        int m3 = 90;
        int m4 = 65;
        int m5 = 78;

        int total = m1 + m2 + m3 + m4 + m5;

        double percentage = total / 5.0;

        System.out.println("Total is " + total);
        System.out.println("Percentage is " + percentage);
        System.out.println("Result is " + (percentage >= 40.0 ? "Passed" : "Failed"));
    }
}
