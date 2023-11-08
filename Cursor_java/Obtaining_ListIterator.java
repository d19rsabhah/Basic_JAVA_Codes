import java.util.*;
public class Obtaining_ListIterator
{
	public static void main(String []args)
	{
		LinkedList l = new LinkedList();
		l.add("C");
		l.add("CPP");
		l.add("JAVA");
		l.add("PHP");
		System.out.println(l);
		ListIterator lit = l.listIterator();
		while(lit.hasNext())
		{
			String s = (String)lit.next();
			if(s.equals("JAVA"))
			{lit.set("Java SE");}
		    else if(s.equals("C"))
			{ lit.add("DS");}
		    else if(s.equals("PHP"))
			{ lit.remove();}
		}
		System.out.println(l);
	}
}