
import java.util.*;

public class mex_a{
    public static void main(String[]arg){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int exist=0;
            int arr[]=new int[n];
             HashSet<Integer> set =new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                set.add(arr[i]);
                if(arr[i]==k)exist++;
            }
            int missing=0;
            for(int i=0;i<k;i++){
              if(!set.contains(i))missing++;
            }
            System.out.println(Math.max(missing,exist));
            

        }
    }
}
