import java.util.Scanner;
public class P2q9 {
    public static void main(String[] args) {
        Scanner viv = new Scanner(System.in);
        int sensorValue,svalue;
        double temperature;

        System.out.print("Enter the sensor value:");
        sensorValue = viv.nextInt();

        temperature = (double) sensorValue / 10.0;
        svalue=(int)temperature;
        System.out.println("Temperature is " + temperature + " degrees C");
        System.out.println("Status: " + ((svalue<35)?"LOW":(svalue<=38)?"NORMAL":"HIGH"));
        System.out.println("Stored Value = "+svalue);
    }
}
