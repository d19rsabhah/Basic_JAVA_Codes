package Single_Operation_Part_2;

import java.util.Scanner;

public class Single_Operation_2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = Sc.nextInt();
            int count = 0;
            char []S = Sc.next().toCharArray();
            for(int j = 0; j < n; j++)
            {
                count++;
                if(j < n - 1)
                {
                    if(S[j + 1] == '1')
                    {
                        break;
                    }
                }

            }
            System.out.println(count);
        }

    }
}
