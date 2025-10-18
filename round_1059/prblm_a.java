
import java.util.Scanner;

public class prblm_a{
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     int t=sc.nextInt();
     for(int m=0;m<t;m++){
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            ans=Math.max(arr[i],ans);
        }
        System.out.println(ans);
     }
    }
}