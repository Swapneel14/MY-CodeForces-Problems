
import java.util.Scanner;

public class fox_and_snake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        char arr[][]=new char[n][m];
        int f=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    arr[i][j]='#';
                }
            }
            else{
                if(f==0){
                    for(int j=0;j<m;j++){
                        if(j==m-1)arr[i][j]='#';
                        else arr[i][j]='.';
                    }
                    f=1;
                }
                else{
                     for(int j=0;j<m;j++){
                        if(j==0)arr[i][j]='#';
                        else arr[i][j]='.';
                    }
                    f=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}