import java.util.Scanner;

public class nico_tactical_cards {
    public static void solve(long[]a ,long []b){
        int n=a.length;
        long  omax=0,omin=0;
        for(int i=0;i<n;i++){
            long nmax=Math.max(omax-a[i],b[i]-omin);
            long nmin=Math.min(omin-a[i],b[i]-omax);
            omax=nmax;
            omin=nmin;
        }
        System.out.println(omax);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            long[]a=new long[n];
            long[]b=new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            solve(a,b);
            
        }
    }
}