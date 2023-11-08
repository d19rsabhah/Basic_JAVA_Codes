import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        int size;
        System.out.print("Enter number of elements :> ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Enter elements :> ");
for (int i = 0; i < size; i++)
{
    a[i] = sc.nextInt();
    Native_Approach(a[i]);
    Using_Bitwise_OR(a[i]);
    Using_Bitwise_AND(a[i]);
    Using_Bitwise_XOR(a[i]);
}


    }
    static void Native_Approach(int b)
    {
       // System.out.println("Using Native Approach>>");
        if(b % 2 == 0)
        {
            System.out.println("Entered number is EVEN! ");
        }
        else
        {
            System.out.println("Entered number is ODD! ");
        }
    }
    static void Using_Bitwise_OR(int OR)
    {
       // System.out.println("Using Bitwise OR>>");

        if ((OR | 1) > OR)
        {
            System.out.println("Entered number is EVEN!");
        }
        else
        {
            System.out.println("Entered number is ODD!");
        }
    }
    static void Using_Bitwise_AND(int AND)
    {
        //System.out.println("Using Bitwise AND>>");

        if((AND & 1) == 1)
        {
            System.out.println("Entered number is ODD!");
        }
        else
        {
            System.out.println("Entered number is EVEN!");
        }
    }
    static void Using_Bitwise_XOR(int XOR)
    {
       // System.out.println("Using Bitwise XOR>>");

        if ((XOR ^ 1) == XOR + 1)
        {
            System.out.println("Entered number is EVEN!");
        }
        else
        {
            System.out.println("Entered number is ODD!");
        }
    }
}
