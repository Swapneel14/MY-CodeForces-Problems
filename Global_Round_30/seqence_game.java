import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class a{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                list.add(val);
            }
            int x=sc.nextInt();
            int max = Collections.max(list);
            int min = Collections.min(list);
            if(x<=max&&x>=min)System.out.println("YES");
            else System.out.println("NO");
        }
 
    }
}
