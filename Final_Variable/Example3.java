public class Example3
{
   public void function()
{ final int x = 9; 
   System.out.println("Final local variable : x = "+x); 
}
      public static void main(String []args)
       {
          Example3 E = new Example3();
           E.function();
       }
}