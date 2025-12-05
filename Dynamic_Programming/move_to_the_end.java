import java.util.Scanner;
//Rating-1000

public class move_to_the_end {
    public static void solve(long[]arr,long[]max){
        int n=arr.length;
        long[]dp=new long[n];
        long sum=0;
        for(int i=n-1;i>=0;i--){
            dp[i]=sum+max[i];
            System.out.print(dp[i]+" ");
            sum+=arr[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            long[]arr=new long[n];
            long[]max=new long[n];
            long m=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
               m=Math.max(arr[i],m);
               max[i]=m;
            }
           solve(arr,max);
           System.out.println("");

        }
    }
}