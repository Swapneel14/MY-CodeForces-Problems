
import java.util.Scanner;

public class Nearly_lucky_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        long n=sc.nextLong();
        while(n>0){
            long dig=n%10;
            if(dig==4||dig==7)count++;
            n/=10;
        }
        if(count==0){
            System.out.println("NO");
                return;
        }
        while(count>0){
            int dig=count%10;
            if(dig!=4&&dig!=7){
                System.out.println("NO");
                return;
            }
            count/=10;
        }
        System.out.println("YES");
    }
}
    