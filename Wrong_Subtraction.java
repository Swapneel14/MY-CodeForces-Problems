
import java.util.Scanner;

public class  Wrong_Subtraction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            if(n%10==0){
                n/=10;
            }
            else n-=1;
        }
        System.out.println(n);
    }
}