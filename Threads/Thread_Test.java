class A extends Thread
{
        public void run()
       { 
           for(int i = 0; i <= 5; i++)
          {
              System.out.println("\tFrom Thread A : i =  " + i);
          }
       }
}
class B extends Thread
{
        public void run()
       { 
           for(int j = 0; j <= 5; j++)
          {
              System.out.println("\tFrom Thread B : j =  " + j);
          }
       }
}
class C extends Thread
{
        public void run()
       { 
           for(int k= 0; k <= 5; k++)
          {
              System.out.println("\tFrom Thread C : k =  " + k);
          }
       }
}
class Thread_Test
{
       public static void main(String []args)
      {
          new A().start();
          new B().start();
          new C().start();
      }
}


            
