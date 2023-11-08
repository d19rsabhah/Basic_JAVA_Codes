import java.util.*;
public class Obtaining_Enum
{
	public static void main(String []args)
	{
		Vector v = new Vector();
		v.addElement("Krsna");
		v.addElement("Balaram");
		v.addElement("Sankarshan");
		v.addElement("Narayan");
		v.addElement("MahaSankarshan");
		v.addElement("KaronoDaksayi Vishnu");
		v.addElement("GarvoDaksayi Vishnu");
		v.addElement("KshiroDaksayi Vishnu");
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			String s = (String)e.nextElement();
			System.out.println(s + "-->" + s.length());
		}
	}
}