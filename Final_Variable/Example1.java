public class Example1
{
   //  private final int x = 5;    declaring final variable process 1
    private final int x;
   //   { x = 7;}  process 2
  Example1()    // process 3
  {
      
     x = 8;
   }

      public static void main(String []args)
       {
          Example1 E = new Example1();
           System.out.println("Instance member Final variable:- " + E.x);
       }
}