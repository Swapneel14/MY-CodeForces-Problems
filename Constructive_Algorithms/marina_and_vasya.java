
import java.util.Scanner;

public class marina_and_basya{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();

        String s1=sc.next();
        String s2=sc.next();
        boolean issame[]=new boolean[n];
        int same=0;
        for(int i=0;i<n;i++){
           if(s1.charAt(i)==s2.charAt(i)){
            same++;
           issame[i]=true;
           }
        }
        int diff=n-same;
        if(diff/2 +same<(n-t)){
            System.out.println("-1");
            return;
        }
        int extra_same=(n-t)-same;
        StringBuilder sb=new StringBuilder();
        
        if(extra_same>0){
            extra_same=2*extra_same;
        }
        boolean one=true;
        for(int i=0;i<n;i++){
           
            if(!issame[i]){
               if(extra_same>0){
                if(one)sb.append(s1.charAt(i));
                else sb.append(s2.charAt(i));

               one=!one;
               extra_same--;
               }
               else {
                char ch1=s1.charAt(i);
                char ch2=s2.charAt(i);
                char ch;
                if (ch1 != 'a' && ch2 != 'a') ch='a';
                else if (ch1 != 'b' && ch2 != 'b') ch='b';
                else ch='c';
                
                sb.append( ch);
                
               }
            }
            else if(issame[i]){
                if(extra_same<0){
                char ch1=s1.charAt(i);
                char ch2=s2.charAt(i);
                char ch;
                if (ch1 != 'a' && ch2 != 'a') ch='a';
                else if (ch1 != 'b' && ch2 != 'b') ch='b';
                else ch='c';
                
                sb.append( ch);
                extra_same++;
                }
                else {
                    sb.append(s1.charAt(i));
                }
                
                
            }
        }
        System.out.println(sb.toString());
    }
}
