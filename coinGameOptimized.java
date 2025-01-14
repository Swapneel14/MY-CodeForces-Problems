import java.util.Scanner;

public class coinGameOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tst = sc.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < tst; i++) {
            int len = sc.nextInt();
            String game = sc.next();  // Directly read the string as input

            // Count the occurrences of 'U'
            int uCount = 0;
            for (int j = 0; j < len; j++) {
                if (game.charAt(j) == 'U') {
                    uCount++;
                }
            }

            // Check if the count of 'U' is odd or even and print the result
            if (uCount % 2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}

