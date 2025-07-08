
import java.util.Scanner;

//n, k, l, c, d, p, nl, np,//
public class Soft_drinking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int t1= (k*l/n)/nl;
        int t2=(p/n)/np;
        int t3=(c*d)/n;
        System.out.println(Math.min(t1,Math.min(t2,t3)));
    }
}