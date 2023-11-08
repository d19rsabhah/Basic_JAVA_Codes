import java.io.*;
public class Example
{
public static void main(String []args)throws IOException
{
File f1 = new File("C:/document/Java_Basic/Learning/File_Handling/chanting.txt");
File f2 = new File("C:/document/Java_Basic/Learning/File_Handling/name1.txt");
File f3 = new File("C:/document/Java_Basic/Learning/File_Handling/Sb.txt");
f2.createNewFile();
f3.createNewFile();
System.out.println("Is file exist : "+f1.exists());
System.out.println("Is file exist : "+f2.exists());
System.out.println("Can file Read : "+f1.canWrite());
System.out.println("Can file Read : "+f2.canWrite());
System.out.println("File Name : "+f1.getName());
System.out.println("File Name : "+f2.getName());
System.out.println("Length of file : "+f1.length());
System.out.println("Length of file : "+f2.length());
f3.delete();


}
}
