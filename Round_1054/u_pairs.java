
import java.util.*;

public class u_pairs{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int max= Integer.MIN_VALUE;
            for(int i=1;i<n;i=i+2){
               max=Math.max(max,arr[i]-arr[i-1]);
            }
            System.out.println(max);
        }
    }
}