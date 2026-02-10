
import java.util.ArrayList;
import java.util.Scanner;

public class Anya_and_the_smartphone{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer>apps =new ArrayList<>();
        int[]pos=new int[n+1];
        int[]seq = new int[m];
        long ans=0;
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            apps.add(val);
           pos[val]=i;
        }

        for(int i=0;i<m;i++){
            seq[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++){
            int index=pos[seq[i]];
            ans+=(long)((index/k)+1);
            if(index!=0){
                int val=apps.get(index-1);
                pos[val]=index;
                pos[apps.get(index)]=index-1;
                apps.set(index-1,apps.get(index));
                apps.set(index, val);
            }
        }

        System.out.println(ans);
    }
}
