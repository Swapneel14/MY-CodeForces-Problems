
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class  prblm_c{
    static final int N=200010;
    static ArrayList<Integer>[]pfac=new ArrayList[N+1];
   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         for(int i=0;i<=N;i++){
        pfac[i]=new ArrayList<>();
        }
        for(int i=2;i<=N;i++){
            if(pfac[i].isEmpty()){
                for(int j=i;j<=N;j+=i){
                    pfac[j].add(i);
                }
            }
        }
        int t=sc.nextInt();
        for(int z=0;z<t;z++){
            HashMap<Integer,Integer>cnt=new HashMap<>();
            int n=sc.nextInt();
            int ans=2;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
            }
            int b=1;
            for(int i=0;i<n;i++){
                b=sc.nextInt();
            }
            for(int v:a){
              for(int x:pfac[v]){
                if (cnt.getOrDefault(x, 0) > 0) ans = 0;
                cnt.put(x, cnt.getOrDefault(x, 0) + 1);
              }
            }
            for(int v:a){
                for(int x:pfac[v])cnt.put(x,cnt.get(x)-1);
                for(int x:pfac[v+1]){
                    if(cnt.getOrDefault(x, 0)>0)ans=Math.min(ans,1);
                }
                for(int x:pfac[v])cnt.put(x,cnt.get(x)+1);

            }
            System.out.println(ans);
        }

    }
}
