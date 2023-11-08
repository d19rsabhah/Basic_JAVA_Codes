class A
{
int a;
public A(int x)
{
a = x;
System.out.println("A : "+a);
}
public A()
{
System.out.println("Default Constructor !");
}
}
class B extends A
{
int b = 5;
public B()
{
// super();
// super(6);
System.out.println("B : "+b);
}
}
class Example
{
public static void main(String []arg)
{
B obj = new B();
}
} 