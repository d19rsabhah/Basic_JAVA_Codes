import java.util.*;
public class Obt_LnkHSet
{
	public static void main(String []args)
	{
		LinkedHashSet H = new LinkedHashSet();
		H.add("One");
		H.add("Two");
		H.add("Three");
		H.add("Four");
		H.add("One");
		System.out.println(H);
	}
}