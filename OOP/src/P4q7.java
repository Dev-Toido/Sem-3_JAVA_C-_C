import java.util.Scanner;

public class P4q7 {
    static void main() {
        int max1=0,max2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max1=Integer.MIN_VALUE;max2=Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            if(arr[i]<max1 && arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("The second largest number is = "+max2);
    }
}
