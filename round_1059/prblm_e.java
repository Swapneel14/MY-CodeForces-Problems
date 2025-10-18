
import java.util.*;

public class prblm_e{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer>list=new HashSet<>();
            for(int i=0;i<n;i++){
                  a[i]=sc.nextInt();
                  list.add(i+1);
            }
             for(int i=0;i<n;i++){
                  if(list.contains(a[i])){
                    list.remove(a[i]);

                  }
            }
            if(list.isEmpty()){
                for(int i=0;i<k;i++){
                    System.out.print(a[i]+" ");
                }
                System.out.println("");
                continue;
            }
            int s=list.size();
            int o=list.iterator().next();
            System.out.print(o+" ");
            for(int i=0;i<n;i++){
                  
                  list.add(i+1);
            }
            list.remove(o);
            list.remove(a[n-1]);
            for(int i=0;i<k-1;i++){
                if(list.size()>0){
                    int x=list.iterator().next();
                    System.out.print(x+" ");
                    list.remove(x);
                }
                else{
                    System.out.print(a[n-1]+" ");
                }
            }
            System.out.println("");





        }
    }
}
