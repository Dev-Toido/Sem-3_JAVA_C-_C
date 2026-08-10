import java.util.Scanner;

public class P3q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1,total=0,serving=0,highestPurchase=0,avgPurchase;
        while(n!=0){
            System.out.print("Enter amount (0 to stop): ");
            n=sc.nextInt();
            if(n==0){break;}
            total+=n;
            serving++;
            highestPurchase=Math.max(highestPurchase,n);

        }
        avgPurchase=total/serving;

        System.out.println("Total Sales: Rs "+total);
        System.out.println("Customers Served: "+serving);
        System.out.println("Highest Purchase: Rs "+highestPurchase);
        System.out.println("Average Purchase: Rs "+avgPurchase);
    }
}
