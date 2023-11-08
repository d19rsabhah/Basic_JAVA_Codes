package Single_Operation_Part_2;
import java.util.Scanner;
class Co_Prime {
    static boolean CoPrime(int A, int B)
    {
        if((A, B) == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String []args)
    {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        for(int u = 0; u < t; u++)
        {
            int n = Sc.nextInt();
            int []Arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                Arr[i] = Sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int i = n - 1; i >= 0; i--)
            {
                for(int j = i; j >= 0; j--)
                {
                    if(CoPrime(Arr[i], Arr[j]))
                    {
                        min =  Math.max(min, i + j);
                    }
                }
            }
            if(min == Integer.MAX_VALUE)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println((min + 2));
            }
        }
    }
}
