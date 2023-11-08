import java.io.*;
public class Buffered_File
{
	public static void main(String []args) throws IOException
	{
		FileWriter Fw = new FileWriter("file.txt", true);
		BufferedWriter bf = new BufferedWriter(Fw);
		bf.write("Computer");
		bf.close();
		
	}
}