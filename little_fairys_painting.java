import java.util.HashSet;
import java.util.Scanner;

public class  little_fairys_painting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashSet<Integer>set=new HashSet<>();
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                set.add(val);
            }
            int init=set.size();
            while(!set.contains(init)){
                set.add(init);
                init=set.size();
            }
            System.out.println(init);
        }
    }
}