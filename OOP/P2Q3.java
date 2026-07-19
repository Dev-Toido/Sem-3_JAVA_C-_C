//Scenario: An electricity board charges: 0–100 units @ ₹3, 101–200 @ ₹5, above 200 @ ₹8. Plus a fixed meter rent of ₹50.

public class P2Q3 {
    public static void main(String[] args) {
    int previousReading = 1200;
    int currentReading = 1450;

    int units = previousReading-currentReading;
    int bill = 50 + ((units<=100)?units*3:300) + (((units-100)<=100)?(units-100)*5:500)+((units>200)?(units-200)*3:300);
    }
}
