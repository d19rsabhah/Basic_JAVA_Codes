import java.io.*;
class File_Example_1
{
	public static void main(String []args) throws IOException
	{
		int i;
		FileInputStream F_In_Str;
		F_In_Str = new FileInputStream("./data.txt");
		do
		{
			i = F_In_Str.read();
			if(i != -1)
			{
				System.out.print((char)i);
			}
		}while(i != -1);
		F_In_Str.close();
	}
}