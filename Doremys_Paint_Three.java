
import java.util.*;

public  class Doremys_Paint_Three{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int arr[]= new int[n];
            HashSet<Integer>set=new HashSet<>();
            HashMap<Integer,Integer>map=new HashMap<>();

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                set.add(arr[i]);
                map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            }
            if(set.size()<=2){
                ArrayList<Integer>list=new ArrayList<>(set);
                if(set.size()==1)System.out.println("yes");
                else{
                    int diff=Math.abs(map.get(list.get(0))-map.get(list.get(1)));
                    if(diff<=1)System.out.println("yes");
                    else{
                        System.out.println("no");
                    }
                }
                
            }
            else System.out.println("no");
        }
    }
}