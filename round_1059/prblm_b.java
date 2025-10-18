
import java.util.ArrayList;
import java.util.Scanner;

public class prblm_b{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
          int n=sc.nextInt();
          String s=sc.next();
           int low=0,high=n-1;
           boolean pali=false;
           while(low<=high){
             if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
             }
             else{
                break;
             }
           }
           if(low>high)pali=true;
           if(pali){
            System.out.println(0);
           }
           else{
               ArrayList<Integer>list=new ArrayList<>();
               for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='1'){
                    list.add(i+1);
                }
               }
               System.out.println(list.size());
               for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
               }
               System.out.println("");
           }
        }
    }
}