import  java.util.Scanner;
public class beautiful_matrix{
    public static void main(String[] args) {
        int mycol=0,myrow=0;
        Scanner sc= new Scanner(System.in);
        int mat[][]=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==1){
                    mycol=j;
                    myrow=i;
                }
            }
        }
        int colshift=Math.abs(mycol-2);
        int rowshift=Math.abs(myrow-2);
        System.out.println(colshift+rowshift);
    }
}