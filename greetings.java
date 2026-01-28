import java.util.*;

public class greetings{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[][]points=new long[n][2];
            ArrayList<Long>end=new ArrayList<>();
            
            
            
            for(int i=0;i<n;i++){
                points[i][0]=sc.nextLong();
                points[i][1]=sc.nextLong();
                end.add(points[i][1]);
                
            }
            
            Collections.sort(end);
            
            Arrays.sort(points,(a,b)->Long.compare(a[0],b[0]));
            long ans=0;
            for(int i=0;i<n;i++){
              long endpoint= points[i][1];
              int ind=Collections.binarySearch(end, endpoint);
              ans+=(ind);
              end.remove(ind);
            }
            System.out.println(ans);
          

        }
    }
}
