public class P2q2 {
    public static void main(String[] args) {
        double basicSalary = 45000.0;
        double hra = basicSalary * 0.2;
        double da = basicSalary * 0.3;
        double pf = basicSalary * 0.12;

        double netSal = basicSalary + hra + da - pf;

        System.out.println("Basic Salary is: " + basicSalary);
        System.out.println("HRA is: " + hra);
        System.out.println("DA is: " + da);
        System.out.println("PF is: " + pf);
        System.out.println("Net Salary is: " + netSal);
    }
}
