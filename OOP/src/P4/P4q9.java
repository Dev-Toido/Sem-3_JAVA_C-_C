import java.util.Scanner;

public class P4q9 {
    static void main() {
        int sum = 0,min,max,aboveAverage=0;double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the marks of the students: ");
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
        for(int i=0;i<n;i++){
            if(arr[i]>avg){
                aboveAverage++;
            }
        }
        System.out.println("Class Average = "+avg);
        System.out.println("Highest Marks = "+max);
        System.out.println("Lowest Marks = "+min);
        System.out.println("Students Above Average: = "+aboveAverage);
        System.out.println("Topper's Marks = "+max);


    }
}
