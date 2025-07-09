import  java.util.ArrayList;
import  java.util.Scanner;
public class Chewbacca_And_Number{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n =  sc.nextLong();
        ArrayList<Integer>list=new ArrayList<>();
        while(n!=0){
            int dig=(int)(n%10);
            if(dig>=5)list.add(9-dig);
            else list.add(dig);
            n/=10;
        }
        long ans=0;
        if(list.get(list.size()-1)==0)list.set(list.size()-1,9);
        for(int i=list.size()-1;i>=0;i--){
           ans=ans*10+list.get(i);
        }
        if(ans==0){
            list.set(list.size()-1,9);
            for(int i=list.size()-1;i>=0;i--){
           ans=ans*10+list.get(i);
        }
        }
        System.out.println(ans);
    }
}