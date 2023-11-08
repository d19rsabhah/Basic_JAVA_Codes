import java.io.*;
class Buffered_ReadLine
{
	public static void main(String []args)throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("file.txt"));
		String S1;
		while((S1 = bf.readLine()) != null)
			System.out.print(S1 + " ");
		bf.close();
		
	}
}