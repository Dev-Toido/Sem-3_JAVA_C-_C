import java.util.Scanner;

public class P4q8 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] uni_arr = new int[n];
        int count=0;boolean isPresent;
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            isPresent =false;
            for(int j=0;j<count;j++){
                if(arr[i]==uni_arr[j]){
                    isPresent =true;
                }
            }
            if(!isPresent){
                uni_arr[count++]=arr[i];
            }
        }
        System.out.print("The unique elements in the array are: ");
        for(int j=0;j<count;j++){
            System.out.print(uni_arr[j]+" ");
        }
    }
}
