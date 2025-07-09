import java.util.*;
public class New_Year_Meeting_Friends{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x1=sc.nextInt();
       int x2=sc.nextInt();
       int x3=sc.nextInt();
       int d1=Math.abs(x1-x2);
       int d2=Math.abs(x1-x3);
       int d3=Math.abs(x3-x2);
       int max=Math.max(d1,Math.max(d2,d3));
       if(max==d1)System.out.println(d2+d3);
       else if(max==d2)System.out.println(d1+d3);
       else System.out.println(d1+d2);

    }
}