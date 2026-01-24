
import java.util.Scanner;

public class bits{

    public static long solve(long l,long r){
        if(l==r){
            return l;
        }
        long num=1;
        while(num*2<=r){
            num*=2;
        }

        if(num<=l){
           return solve(l-num,r-num)+num;
        }
        else if(num*2 -1 <=r)return num*2-1;
        else return num-1;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long l=sc.nextLong();
            long r=sc.nextLong();
            System.out.println(solve(l,r));

        }
    }
}
