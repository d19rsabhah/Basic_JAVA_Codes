class A
{
     public void f1(int x)
       {
             System.out.println("Class A! " + x);
       }
  public void f1(int a, int b)
       {
             int x2 = a; int x1 = b;
            int s = x2 +x1;
             System.out.println("Class A! "+ s);
       }
}
class B extends A
{
     public void f1()
        {
             System.out.println("Class B!");     
         }
}
public class Example1
{
    public static void main(String []args)
      {
          B obj = new B();
          obj.f1();
          obj.f1(5);
          obj.f1(3, 4);
      }

}