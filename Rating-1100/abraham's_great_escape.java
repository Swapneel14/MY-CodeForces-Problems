
import java.util.Scanner;

public class Abrahams_Great_Escape{

   static void solve(int n,int k){
        if(k==n*n-1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
            for(int i=1;i<=n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=1;j<=n;j++){
                    if(k>0){
                        sb.append('U');
                        k-=1;
                    }
                    else if(i==n){
                       if(j==n)sb.append('L');
                       else sb.append('R');
                    }
                    else{
                        sb.append('D');
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            solve(n,k);
        }
    }
}
