import java.util.ArrayList;
import java.util.Scanner;
 
public class a{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer>list=new ArrayList<>();
            int x=-1,y=-1;
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
               if(list.size()>0){
                for(int j=0;j<list.size();j++){
                    if(val%list.get(j)%2==0){
                        x=list.get(j);
                        y=val;
                        break;
                    }
                }
               
               }
               list.add(val);
               
            }
            if(x!=-1&&y!=-1)System.out.println(x+" "+y);
               else System.out.println(-1);
            
        }
 
    }
}
