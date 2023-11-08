public class Example2
{
   //  private final static int x = 5;    declaring final variable process 1
    private final static int x;
         static{ x = 7;} 


      public static void main(String []args)
       {
          Example2 E = new Example2();
           System.out.println("Final Static member variable:- " + E.x);
       }
}