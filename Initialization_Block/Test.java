public class Test
{
   private int x;
     {
          System.out.println("Initialization Block :- x = " + x);
          x++;
      }
       {
          System.out.println("Initialization Block :- x = " + x);
          x += 3;
      }
  {
          System.out.println("Initialization Block :- x = " + x);
          x += 2;
      }
     public Test()
    {
    System.out.println("Constructor :- x = " + x);
      }
public static void main(String []args)
    {
          Test T1 = new Test();
    }
}