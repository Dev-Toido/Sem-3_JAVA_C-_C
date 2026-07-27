import java.util.Scanner;

public class P4q5 {
    static void main() {
        int sum = 0,min,max;double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        min=max=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        avg=(double)sum/n;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Largest = "+min);
        System.out.println("Smallest = "+max);
    }
}
