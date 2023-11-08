class Outer
{
	String x = "Hari Bol!";
	static int y = 20;
	static class Inner
	{
		void if_1()
		{
			System.out.println("if_1()" + y);
		} 
	}
	class Inner_1 
	{
		void Math()
		{
			System.out.println("Hare Krsna! " + x);
		}
	}
	public static void main(String[] args)
	{
		Outer Out = new Outer();
		Outer.Inner Inn = new Outer.Inner();
		Outer.Inner_1 Inn1 = Out.new Inner_1();
		Inn1.Math();
		Inn.if_1();
	}
}
