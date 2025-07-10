
import java.util.HashMap;
import java.util.Scanner;

public class presents {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            map.put(arr[i],i+1);
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(i+1);
            System.out.print(arr[i]+" ");
           
        }

    }
}