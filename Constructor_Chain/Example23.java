class A
{
    public A()
     { System.out.println(" A - 1 "); }
    public A(int j)
     { System.out.println(" A - 2 "); }

}
class B extends A
{
    public B()
      {
           this(5);
           System.out.println(" B - 1 ");
       }
     public B(int k, int h)
      {
           System.out.println(" B - 3 ");
       }
    public B(int i)
      {  
           super(6);    
           System.out.println(" B - 2 ");
       }
}
class Example23
{
    public static void main(String []args)
      {
           B ol = new B();
           B o2 = new B(4, 9);
      }
}