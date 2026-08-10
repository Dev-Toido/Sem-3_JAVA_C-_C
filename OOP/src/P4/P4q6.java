import java.util.Scanner;

public class P4q6 {
    static void main() {
        int left,right;
        Scanner sc = new Scanner(System.in);
        //Input Part
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements in the array in given order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Processing Part
        left=0;
        right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        //Output Part

        System.out.print("The elements in the array in reversed order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
