import java.util.Scanner;

public class need_more_arrays {
    public static void solve(int[]arr){
        int n=arr.length;
        int[][]dp=new int[n][2];
        dp[0][0]=1;
        dp[0][1]=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>dp[i-1][1]+1){
                dp[i][1]=arr[i];
                dp[i][0]=dp[i-1][0]+1;
            }
            else{
                dp[i][0]=dp[i-1][0];
                dp[i][1]=dp[i-1][1];
            }
        }
        System.out.println(dp[n-1][0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            solve(arr);
        }
    }
}