
import java.util.Scanner;

public class Tram{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][2];
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            mat[i][0]=sc.nextInt();
            mat[i][1]=sc.nextInt();
            sum-=mat[i][0];
            sum+=mat[i][1];
            max=Math.max(max,sum);
        }
        max=Math.max(max,sum);
        System.out.println(max);
    }
}