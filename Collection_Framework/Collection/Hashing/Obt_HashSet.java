import java.util.*;
public class Obt_HashSet
{
	public static void main(String []args)
	{
		HashSet H = new HashSet();
		H.add("One");
		H.add("Two");
		H.add("Three");
		H.add("Four");
		H.add("One");
		System.out.println(H);
	}
}