import java.lang.*;
import java.io.*;
import java.util.*;
class Diagonal_Element
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][4];
		ArrayList<Integer>l= new ArrayList<>();
			ArrayList<Integer>r= new ArrayList<>();
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int q = 0;
		for(int i = 0; i < 4; i++)
		{
			l.add(arr[i][q]);
			q++;
		}
		int p = 0;
		for(int i = 4 - 1; i >= 0; i--)
		{
			r.add(arr[i][p]);
			p++;
		}
		int k = 0, v = 0, s_l = 0, s_r = 0;
		System.out.println(" ");
		while(k < 4)
		{
			System.out.print(l.get(k) + " ");
			s_l += l.get(k);
			k++;
			
		}
		System.out.println(" ");
		while(v < 4)
		{
			System.out.print(r.get(v) + " ");
			s_r += r.get(v);
			v++;
		}
		int diff = Math.abs(s_l - s_r);
		System.out.println(" ");
		System.out.println(diff + "\n");
	}
}