import java.util.Scanner;

public class P4q10 {
    static void main() {
        int sum = 0,max,bestSales=0,aboveAverage=0;double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number days of sales: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the daily sales amount: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>=max){
                max=arr[i];
                bestSales=i+1;
            }
            sum+=arr[i];
        }
        avg=(double)sum/n;
        for(int i=0;i<n;i++){
            if(arr[i]>10000){
                aboveAverage++;
            }
        }
        System.out.println("Total Monthly Sales: Rs"+sum);
        System.out.println("Average Daily Sales = Rs"+avg);
        System.out.println("Best Sales Day: Day "+bestSales+" (Rs"+max+")");
        System.out.println("Days Above Rs10000: "+aboveAverage);
        System.out.println("% Day Above Average: "+((double)aboveAverage/n*100.0));


    }
}
