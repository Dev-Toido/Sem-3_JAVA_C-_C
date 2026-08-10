import java.util.Scanner;


public class P2q10 {
    static double scholarshipDisbursed=0;
    static int noOfScholarship=0;
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);
        double marks,attendance,annualFees,familyIncome,scholarship=0;
        String category;
        int cat;
        char isContinue='y';

        System.out.println("Welcome to the Student Scholarship Eligibility System!");
        do {
            System.out.print("Enter your marks(1-100): ");
            marks = viv.nextDouble();
            System.out.print("Enter your attendance in percentage(0-100%): ");
            attendance = viv.nextDouble();
            System.out.print("Enter the category(1 for GEN, 2 for OBC, 3 for SC/ST): ");
            cat = viv.nextInt();
            System.out.print("Enter your annual fees: ");
            annualFees = viv.nextDouble();
            System.out.print("Enter your family income: ");
            familyIncome = viv.nextDouble();
            scholarship = 0;
            switch (cat) {
                case 1:
                    category = "GEN";
                    if (familyIncome <= 300000) {
                        scholarship = 50;
                    }
                    break;
                case 2:
                    category = "OBC";
                    scholarship = 75;
                    break;
                case 3:
                    category = "SC/ST";
                    scholarship = 100;
                    break;
                default:
                    System.out.println("Invalid category");
            }

            if (marks >= 75 && attendance >= 80) {
                System.out.println("You are eligible for full scholarship of " + scholarship + "% of fees");
                noOfScholarship++;
            } else if (marks >= 60 && attendance >= 80) {
                scholarship = 25;
                System.out.println("You are eligible for partial scholarship of" + scholarship + "% of fees");
                noOfScholarship++;
            } else {
                System.out.println("You are not eligible for scholarship as " + ((marks < 60) ? "marks < 60" : "") + " " + ((attendance < 80) ? "attendance < 80" : ""));
            }
            scholarship = annualFees * (scholarship / 100);
            System.out.println("Your final annual fees = Rs." + (annualFees - scholarship));
            scholarshipDisbursed += scholarship;
            System.out.print("Do you have more records to check scholarship eligibility? (y/n): ");
            isContinue = viv.next().charAt(0);
        } while (isContinue == 'y');
        System.out.println("Total scholarship disbursed = " + scholarshipDisbursed);
        System.out.println("Total no. of scholarship = " + noOfScholarship);
    }
}
