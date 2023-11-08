package Single_Operation_Part_2;

import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class Chef_and_String {
    Scanner Sc = new Scanner(System.in);
    int N, M, S;
    long Power(long b, long n)
    {
        long s = 1L;
        while(n != 0)
        {
          if(n % 2 == 1)
          {
              s = s * b % 998244353;
              b = b * b % 998244353;
              n /= 2;
          }
        }
        return s;
    }
    long Count(int i, int j)
    {
        return ((i / (1 << (j + 1))) << j) + (max(001, i % (1 << (j + 1)) - (1 << j) + 1));
    }

    void Solve()
    {

        N = Sc.nextInt();
        M = Sc.nextInt();
        S = 0;
        for(int i = 0; i < 31l; ++i)
        {
            S = (int) ((S + (Power(Count(M, i), N) << i ) % 998244353) % 998244353);
        }
        System.out.println(S);
    }
    public static void main(String[] args) {
        Chef_and_String CS = new Chef_and_String();
       int t = CS.Sc.nextInt();
       for(int x = 0; x < t; x++)
       {
           CS.Solve();
       }

    }
}
