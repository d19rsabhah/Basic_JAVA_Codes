public class My_Data<T>
{
	T i;
	public void add(T i1)
	{
		i = i1;
	}
	public T get()
	{
		return(i);
	}
	public static void main(String []args)
	{
		My_Data<Integer> md_1 = new My_Data<Integer>();
		My_Data<String> md_2 = new My_Data<String>();
		md_1.add(1);
		md_2.add("Rsabh");
		System.out.println("id = " + md_1.get() + "\nname = " + md_2.get());
	}
} 