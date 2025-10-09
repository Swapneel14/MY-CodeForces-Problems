
import java.util.Scanner;

public  class b_positive{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int ans=0;
            int z=0;
            int ones=0;
            int m=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    z++;
                    ans++;
                    arr[i]=1;
                }
                else if(arr[i]==1){
                    ones++;
                }
                else{
                    m++;
                }
            }
            if(m%2!=0)ans=ans+2;
            System.out.println(ans);
        }
    }
}