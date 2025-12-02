import java.util.Scanner;

public class boredom {
   public static void solve(){
    Scanner sc=new Scanner(System.in);
         int n = sc.nextInt();
            int N=100000;
            int max=0;
            long dp[]=new long[N+1];
            int cnt[]=new int[N+1];
            
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                cnt[arr[i]]++;
               
               
            }
            dp[0]=0;
            dp[1]=cnt[1];
          for(int i=2;i<=100000;i++){
            dp[i]=Math.max(dp[i-1],(1L*cnt[i]*i + dp[i-2]));
          }
          System.out.println(dp[100000]);

   }
    public static void main(String[] args) {
       solve();
    }
}