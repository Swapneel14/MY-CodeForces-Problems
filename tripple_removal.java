
import java.util.Scanner;

public class tripple_removal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
            }
            int[] prefix0 = new int[n + 1];
            int[] prefix1 = new int[n + 1];
            for (int i = 1; i <= n; i++) {
               prefix0[i] = prefix0[i - 1] + (arr[i - 1] == 0 ? 1 : 0);
               prefix1[i] = prefix1[i - 1] + (arr[i - 1] == 1 ? 1 : 0);
               
            
            }
            int adj[]=new int[n];
         for(int i=1;i<n;i++){
                adj[i]=adj[i-1]+((arr[i]==arr[i-1])?1:0);
            }
            while(q-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                int left=l-1;
                int right=r-1;
                int ones=prefix1[r]-prefix1[l-1];
                int zeros=prefix0[r]-prefix0[l-1];
                
                if((right-left+1)%3!=0||(zeros%3!=0||ones%3!=0)){
                    System.out.println(-1);
                }
                
                else{
                   int ad=adj[r-1]-adj[l-1];
                   if(ad>0){
                    System.out.println((r-l+1)/3);
                   }
                   else System.out.println(2+(r-l-2)/3);
                }
            }
        }
    }
}