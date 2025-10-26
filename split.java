
import java.util.*;

public class split {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            }
            boolean con=false;
            for (Integer value : map.values()) {
                if(value%k!=0){
                   con=true;
                   System.out.println(0);
                   break;
                }
                
            }

            if(con)continue;
            map.replaceAll((key, value) -> value / k);
            HashMap<Integer,Integer>win=new HashMap<>();
            long ans=0;

            int low=0;
           for(int high=0;high<n;high++){
            int val=arr[high];
            win.put(val,win.getOrDefault(val, 0)+1);
            while(win.get(val)>map.get(val)){
                win.put(arr[low],win.get(arr[low])-1);
                low++;
            }
            ans+=(high-low)+1;


           }
            System.out.println(ans);



        }
    }
}
