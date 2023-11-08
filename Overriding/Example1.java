class A
{
     public void f1(int x)
       {
             System.out.println("Class A! " + x);
       }
}
class B extends A
{
    public void f1(int x)
       {
             System.out.println("Class B! " + x);
       }
}
public class Example1
{
    public static void main(String []args)
      {
          B obj = new B();
          obj.f1(5);
     }
}