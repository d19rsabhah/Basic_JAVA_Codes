import java.io.*;
class Buff_Read
{
	public static void main(String []args)throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("file.txt"));
		char []S = new char[1000];
		bf.read(S, 0, 100);
		System.out.print(S);
		bf.close();
		
	}
}