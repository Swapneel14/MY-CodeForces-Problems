import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); 

            char[][] arr = new char[n][n];
            HashSet<Integer> sum = new HashSet<>();
            HashSet<Integer> diff = new HashSet<>();
            HashSet<Integer> x = new HashSet<>();
            HashSet<Integer> y = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String line = sc.nextLine(); 
                for (int j = 0; j < n; j++) {
                    arr[i][j] = line.charAt(j);
                    if (arr[i][j] == '#') {
                        sum.add(i + j);
                        diff.add(i - j);
                        x.add(i);
                        y.add(j);
                    }
                }
            }

            if (sum.size() < 2) {
                System.out.println("YES");
                continue;
            }

            boolean c1 = (Collections.max(sum) - Collections.min(sum)) <= 1;
            boolean c2 = (Collections.max(diff) - Collections.min(diff)) <= 1;
            boolean c3 = (Collections.max(x) - Collections.min(x) <= 1) &&
                         (Collections.max(y) - Collections.min(y) <= 1);

            if (c1 || c2 || c3)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
