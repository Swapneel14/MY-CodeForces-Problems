
import java.util.HashMap;
import java.util.Scanner;

public class hamburgers{
    public static boolean check(long target,long nb,long ns,long nc,long pb ,long ps,long pc,long r,String burger,HashMap<Character,Long>map){
       long needb = Math.max(0, target * map.getOrDefault('B', 0L) - nb);
        long needs = Math.max(0, target * map.getOrDefault('S', 0L) - ns);
        long needc = Math.max(0, target * map.getOrDefault('C', 0L) - nc);
       long total =needb*pb+needc*pc+needs*ps;
       return total<=r;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String burger=sc.nextLine();
        long nb=sc.nextLong();
        long ns=sc.nextLong();
        long nc=sc.nextLong();
        long pb=sc.nextLong();
        long ps=sc.nextLong();
        long pc=sc.nextLong();
        long r=sc.nextLong();
        long min=0;
        long max=0;
        long ans=0;
        HashMap<Character,Long>map=new HashMap<>();
        for(int i=0;i<burger.length();i++){
         map.put(burger.charAt(i),map.getOrDefault(burger.charAt(i), 0L)+1);
        }
        
long bCount = map.getOrDefault('B', 0L);
long sCount = map.getOrDefault('S', 0L);
long cCount = map.getOrDefault('C', 0L);

if (bCount != 0) {
    max = Math.max(max, (nb + r / pb) / bCount);
}
if (sCount != 0) {
    max = Math.max(max, (ns + r / ps) / sCount);
}
if (cCount != 0) {
    max = Math.max(max, (nc + r / pc) / cCount);
}
if (bCount == 0 && sCount == 0 && cCount == 0) {
    max = r; 
}
       
       while(min<=max){
        long mid=min+(max-min)/2;
        if(check(mid,nb,ns,nc,pb,ps,pc,r,burger,map)){
            ans=mid;
            min=mid+1;
        }
        else max=mid-1;
       }
      System.out.println(ans);
    }
}