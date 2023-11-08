class Generic
{
	public <E> void Print_Arr(E []S)
	{
		for(E Z : S)
		{
			System.out.print(" " + Z + " ");
		}
	}
/*		public void Print_Arr(Integer []Z)
	{
		for(int x = 0; x < Z.length; x++)
		{
			System.out.print(" " + Z[x] + " ");
		}
	}
*/	
	public static void main(String []args)
	{
		Generic Gcc = new Generic();
		String []Names = new String[]{"Keshava", "Narayana", "Madhava", "Govinda", "Vishnava", "Madhusudana", "Trivikrama", "Vamana", "Sridhara", "Hrisikesha", "Padmanava", "Damodara", "Vasudeva"};
		Gcc.Print_Arr(Names);
		Integer []Number = new Integer[]{11, 12, 13, 14, 15};
		Gcc.Print_Arr(Number);
	}
}
		