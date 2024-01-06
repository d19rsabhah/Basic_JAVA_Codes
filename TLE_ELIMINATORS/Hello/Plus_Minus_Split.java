package Hello;

import java.util.Scanner;

public class Plus_Minus_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int c1 = 0, c2 = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '+') {
                    c1++;
                } else {
                    c2++;
                }
            }
            System.out.println(Math.max(c1, c2) - Math.min(c1, c2));
        }
    }
}
