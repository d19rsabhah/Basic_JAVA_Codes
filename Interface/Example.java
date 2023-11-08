interface I1
{
void f1();
}
interface I2
{
 void f2();
}
class A implements I1, I2
{
   public void f1()
   {
      System.out.println("Interface I1");
    }
   public void f2()
    {
       System.out.println("Interface I2");
     }
   public void f3()
     {
       System.out.println("Class A f3");
      }
   }
class Example 
{
    public static void main(String []args)
       {
           I1 i1 = new A();
           i1.f1();
           I2 i2 = new A();
           i2.f2();
           A obj = new A();
           obj.f3();
         }
 } 