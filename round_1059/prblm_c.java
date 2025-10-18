import java.util.*;

public class prblm_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int caseNum = 0; caseNum < t; caseNum++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            long xor = a ^ b;

            // Case 2: one op possible
            if (xor <= a) {
                System.out.println(1);
                System.out.println(xor);
                continue;
            }

            // Case 3: try to find x1 such that x2 = xor ^ x1 <= a1 (where a1 = a ^ x1)
            boolean found = false;
            long x1 = -1, x2 = -1;

            // Single loop (try possible first moves x1)
            // NOTE: This loops from 0..a; correct but can be slow for very large a.
            for (long i = 0; i <= a; i++) {
                long j = xor ^ i;     // required second move
                long a1 = a ^ i;      // value of 'a' after first move
                if (j <= a1) {
                    x1 = i;
                    x2 = j;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(2);
                System.out.println(x1 + " " + x2);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
