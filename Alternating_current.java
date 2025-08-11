
import java.util.Scanner;
import java.util.Stack;

public class Alternating_current{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       Stack<Character>st=new Stack<>();
       if(s.length()%2!=0){
        System.out.println("No");
        return;
       }
       for(int i=0;i<s.length();i++){
          if(st.size()>0&&st.peek()==s.charAt(i)){
            st.pop();
          }
          else{
            st.push(s.charAt(i));
          }
       }
       if(st.size()>0){
        System.out.println("No");//oklll
       }
       else{
        System.out.println("Yes");
       }
    }
    

    
}