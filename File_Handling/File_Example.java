import java.io.*;
class File_Example
{
	public static void main(String []args) throws IOException
	{
		int i;
		FileOutputStream F_out;
		F_out = new FileOutputStream("./data.txt", true);
		String S = "The spirit soul bewildered by the influence of false ego thinks himself the doer of activities that are in actuality carried out by the three modes of material nature.";
		char ch[] = S.toCharArray();
		for(i = 0; i < S.length(); i++)
		{
			F_out.write(ch[i]);
		}
		F_out.close();
	}
}