package Single_Operation_Part_2;

import java.util.Scanner;

public class Single_Operation_1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        for(int x = 0; x < t; x++)
        {
            int l = Sc.nextInt(), count = 0;
            char []S = Sc.next().toCharArray();
            for(int i = 0; S[i] != '\0'; i++)
            {
                if(S[i] == '1')
                {
                    count++;
                }
                else {
                    break;
                }
            }
            System.out.println(count);
        }


    }
}
