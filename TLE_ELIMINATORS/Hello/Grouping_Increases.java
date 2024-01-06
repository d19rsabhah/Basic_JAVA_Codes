package Hello;

import java.util.Scanner;

public class Grouping_Increases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long a = Long.MAX_VALUE;
            long b = Long.MAX_VALUE;
            long count = 0;

            long[] array = new long[(int) n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextLong();

                if (a > b) {
                    long temp = a;
                    a = b;
                    b = temp;
                }

                if (array[i] <= a) {
                    a = array[i];
                } else if (array[i] <= b) {
                    b = array[i];
                } else {
                    a = array[i];
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
