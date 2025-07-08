
import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_round_numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int place=1;
            ArrayList<Integer>list = new ArrayList<>();
            while(n>0){
                int dig= n%10;
                if(dig!=0)list.add(dig*place);
                n/=10;
                place*=10;
            }
            System.out.println(list.size());
            for(int ans:list){
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }
}