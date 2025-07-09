
import java.util.HashMap;
import java.util.Scanner;
/*Tetrahedron. Tetrahedron has 4 triangular faces.
Cube. Cube has 6 square faces.
Octahedron. Octahedron has 8 triangular faces.
Dodecahedron. Dodecahedron has 12 pentagonal faces.
Icosahedron. Icosahedron has 20 triangular faces.*/ 
public class Anton_and_Polyhedrons{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine(); 
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        String arr[]=new String[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
            sum+=map.get(arr[i]);
        }
        System.out.println(sum);
    }
}