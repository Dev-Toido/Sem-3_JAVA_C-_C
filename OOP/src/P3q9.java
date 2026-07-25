import java.util.Scanner;

public class P3q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stepData = new int[30];
        int n,total=0,max=0,count=0,avg;
        System.out.print("Enter the number of days(max 30) of steps data you want to enter: ");
        n=sc.nextInt();

        System.out.println("Enter the steps of each day: ");
        for(int i=0;i<n;i++){
            System.out.print("Enter the value of "+(i+1)+": ");
            stepData[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            //total step count
            total+=stepData[i];

            //highest step count
            max= Math.max(stepData[i], max);

            //Count of the days with steps >= 10000
            if(stepData[i]>=10000) {
                count++;
            }
        }
        avg=total/n;
        System.out.println("Total steps: "+total);
        System.out.println("Highest steps: "+max);
        System.out.println("Avg steps: "+avg);
        System.out.println("Days>=10000 steps: "+count);

    }
}
