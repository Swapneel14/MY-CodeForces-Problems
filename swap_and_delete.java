
import java.util.Scanner;

public  class  swap_and_delete{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           
            String s=sc.next();
            int n=s.length();
            int zeros=0,ones=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0')zeros++;
                else ones++;
            }
            int t_length=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    if(ones>0){
                        t_length++;
                        ones--;
                    }
                    else break;
                }
                else{
                    if(zeros>0){
                        t_length++;
                        zeros--;
                    }
                    else break;
                }
            }
            System.out.println(n-t_length);
        }
    }
}