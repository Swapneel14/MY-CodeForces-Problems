
import java.util.ArrayList;
import java.util.Scanner;

public class  prblm_a{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int s=0;s<t;s++){
         int n=sc.nextInt();
         int k=sc.nextInt();

         String st=sc.next();
         ArrayList<Integer>list=new ArrayList<>();
         for(int i=0;i<n;i++){
            char ch= st.charAt(i);
            if(ch=='1')list.add(i);
         }
         int gap=k-1;
         
         if(list.isEmpty()){
            System.out.println(0);
            continue;
         }
         if(list.size()==1){
            System.out.println(1);
            continue;
         }
         int ans=1;
         for(int i=1;i<list.size();i++){
            int dif=list.get(i)-list.get(i-1);
            if(dif>gap)ans++;
         }
         System.out.println(ans);



        }
    }
}