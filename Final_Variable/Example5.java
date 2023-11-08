class Dummy
{
     public final void someFun() 
           { 
                System.out.println("This is final method You can't Override !");
           }
}
public class Example5 extends Dummy
{
       public static void main(String []args)
       {
          Example5 D = new Example5();
           D.someFun();
       }
}