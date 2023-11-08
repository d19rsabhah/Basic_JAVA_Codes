abstract class A
{
 public int a = 5;
 public double b = 7;
}
class B extends A
{
public void f1()
{
 System.out.println(a);
 System.out.println(b);
}
}
public class Abstraction
{
public static void main(String []args)
{
   B b1 = new B();
   b1.f1();
}
} 