
import java.util.Scanner;

public class chocolates{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int min=arr[n-1];
        long sum=arr[n-1];
        for(int i=n-2;i>=0;i--){
            int val=arr[i];
            if(val>=min)val=min-1;
            if(val<0)val=0;
            sum=sum+val;
            min=Math.min(min,val);
        }
        System.out.println(sum);
    }
}