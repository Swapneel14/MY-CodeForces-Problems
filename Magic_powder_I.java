
import java.util.Scanner;

public class Magic_powder_I{
    public static boolean  yeah(int t,int[]a,int[]b,int k){
            int n=a.length;
            int sum=0;
            for(int i=0;i<n;i++){
                int req=(a[i]*t)-b[i];
                if(req<0)req=0;
                
                sum+=req;
            }
            return sum<=k;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=-1;
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
            if(b[i]>max)max=b[i];
        }
        max=max+k;
        int min=0;
        int ans=-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(yeah(mid,a,b,k)){
                ans=mid;
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        System.out.println(ans);

    }
}