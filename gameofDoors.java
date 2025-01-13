import java.util.Scanner;

public class gameofDoors {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int tst= sc.nextInt();
        
        for(int i=1;i<=tst;i++){
            int l=sc.nextInt();
        int r=sc.nextInt();
        int L = sc.nextInt();
        int R= sc.nextInt();
            if(r<L||R<l){
                System.out.println(1);
            }
            else if(L==r||l==R){
                System.out.println(2);
            }
            else if(l<L){
                if(r<R){
                    System.out.println((r-L+2);
                }
                else if(r==R){
                    System.out.println((r-L+1);
                }
                else{
                    System.out.println(R-L+2);
                }
            }
                else if(L<l){
                    if(R<r){
                        System.out.println(R-l+2);
                    }
                    else if(R==r){
                        System.out.println(R-l+1);
                    }
                    else{
                        System.out.println(r-l+2);
                    }
                    
                }
                else{
                    System.out.println(0);
                }
                System.out.println();
            }
            
        }
    }

