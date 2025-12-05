import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

//Rating-1700

public class consecutive_subsequence {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer>dp=new HashMap<>();
        int[] arr = new int[n];
        int ans=0;
        int curr=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp.put(arr[i],dp.getOrDefault(arr[i]-1, 0)+1);
            if(dp.get(arr[i])>ans){
                ans=dp.get(arr[i]);
                curr=arr[i];
            }
        }
        System.out.println(ans);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]==curr){
                list.add(i+1);
                curr--;
            }
        }
        Collections.reverse(list);
        for(int x:list){
            System.out.print(x+" ");
        }
        
        
    }
}
