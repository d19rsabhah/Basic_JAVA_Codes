package pack1;
import pack2.Student;
public class Example
{ 
    public static void main(String []arg)
       {
           Student S = new Student();
           S.setRoll_No(202124154);
           S.setName("Rishav Das");
           System.out.println("Roll number = "+ S.get_Roll_No());
           System.out.println("Name = "+ S.get_Name());

        }
}