package Single_Operation_Part_2;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int x = 0; x < t; x++)
        {
            int n = s.nextInt(), temp = 0;
            char []str = s.next().toCharArray();
            for(int i = 1; i < n; ++i)
            {
                temp += str[i] != str[i - 1];
            }
            int y = (temp + (str[0] == 49)) / 2;
            System.out.println(y);
        }
    }
}

