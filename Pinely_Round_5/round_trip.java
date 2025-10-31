
import java.util.Scanner;

public class a{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int r=sc.nextInt();
            int x=sc.nextInt();
            int d=sc.nextInt();
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='2'){
                    if(r<x)ans++;
                }
                else{
                    r=r-Math.min(r,d);
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
