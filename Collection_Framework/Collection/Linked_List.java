import java.util.*;
class Linked_List
{
	public static void main(String []args)
	{
		LinkedList list = new LinkedList();
		list.addFirst("Vasudeva");
		list.addLast("Pradyumna");
		list.add(1, "Sankarshan");
		list.add(2, "Aniruddha");
		System.out.print(list.getFirst());
		System.out.print(" " + list.get(1));
		System.out.print(" " + list.getLast());
		System.out.print(" " + list.get(2));
	}
}