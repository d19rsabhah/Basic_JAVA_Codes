import java.io.*;
class Buffered_Read_File
{
	public static void main(String []args)throws IOException
	{
		int ch;
		BufferedReader bf = new BufferedReader(new FileReader("file.txt"));
		while((ch = bf.read()) != -1)
		{
			System.out.print((char)ch);
		}
		bf.close();
		
	}
}