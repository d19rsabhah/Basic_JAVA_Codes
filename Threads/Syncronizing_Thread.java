import java.util.*;
public class Syncronizing_Thread
{
	public static void main(String[] args)
	{
		Account a1 = new Account(100000);
		Customer c1 = new Customer(a1, "Rupanuga"), c2 = new Customer(a1, "Hrisikesa");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}
class Account
{
   private int balance;
   public Account(int balance)
   {
	   this.balance = balance;
   }
   public boolean isSufficientBalance(int w)
   {
	   if(balance > w)
	   {return(true);}
       else
	   {return(false);}
   }
   public void Withdraw(int amt)
   {
	   balance = balance - amt;
	   System.out.println("Withdrawl money is : "+ amt);
	   System.out.println("Your Current Balance is : "+ balance);
   }
}
class Customer implements Runnable
{
	private String name;
	private Account account;
	public Customer(Account account, String n)
	{
		this.account = account;
		name = n;
	}
	public void run()
	{
		Scanner S = new Scanner(System.in);
		
		synchronized(account)
		{
	       System.out.println(name+", Enter amount to withdraw : ");
		   int Amt = S.nextInt();
		if(account.isSufficientBalance(Amt))
		{
		    System.out.println(name);
			account.Withdraw(Amt);
		}
		else
		{
			System.out.println("insufficient Balance !");
		}
		}
	}
}


		
		