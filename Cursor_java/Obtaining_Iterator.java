import java.util.*;
public class Obtaining_Iterator
{
	public static void main(String []args)
	{
		ArrayList al = new ArrayList();
		for(int i = 1; i <= 10; i++)
		{
			al.add(i);

		}
			System.out.println(al);		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Integer I = (Integer)it.next();
			if(I > 3 && I < 8)
			{
				it.remove();
			}
		}
		System.out.println(al);
	}
}
