import java.util.*;
public class Exp_ArrayList
{
	public static void main(String []args)
	{
		ArrayList Al = new ArrayList(4);
		Al.add("Rsabh");
		Al.add("Rasasagar");
		Al.add(0, "Raghava");
		Al.add(2, "Rama");
		Iterator it = Al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
