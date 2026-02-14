//This approach is correct but GOT TLE

import java.util.*;

public class grouping_increases{
   

    public static int solve(int[]arr,ArrayList<Integer>s1,ArrayList<Integer>s2,int ind, int[][][]dp ){
        if(ind==arr.length){
            return 0;
        }
        int first=0,last=0;
        if(!s1.isEmpty()&&!s2.isEmpty()&&dp[ind][s1.get(s1.size()-1)][s2.get(s2.size()-1)]!=-1){
            return dp[ind][s1.get(s1.size()-1)][s2.get(s2.size()-1)];
        }

        

        if(!s1.isEmpty()&&arr[ind]>s1.get(s1.size()-1)){
            first=1;
        }
        s1.add(arr[ind]);
        first+=solve(arr,s1,s2,ind+1,dp);
        s1.remove(s1.get(s1.size()-1));

        if(!s2.isEmpty()&&arr[ind]>s2.get(s2.size()-1)){
            last=1;
        }
        s2.add(arr[ind]);
        last+=solve(arr,s1,s2,ind+1,dp);
        s2.remove(s2.get(s2.size()-1));

        if(!s1.isEmpty() && !s2.isEmpty()){
            return dp[ind][s1.get(s1.size()-1)][s2.get(s2.size()-1)]=Math.min(first,last);
        }
        return Math.min(first,last);
        

    }
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
       // PrintWriter out = new PrintWriter(new File("output.txt"));

        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][][]dp = new int[n+1][n+1][n+1];

            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    Arrays.fill(dp[i][j], -1);
                }
            }
            int[]arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            ArrayList<Integer>s1 = new ArrayList<>();
            ArrayList<Integer>s2 = new ArrayList<>();
            System.out.println(solve(arr,s1,s2,0,dp));
        }


    }
}
