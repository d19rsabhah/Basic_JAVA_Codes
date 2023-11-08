  class Greeting
  {
	  public void Bol_HariBol()
	  {
		  System.out.println("Hari Bol!");
	  }
  }
  class Anonymous
  {
	  Greeting g = new Greeting()
	  {
		  public void Bol_HariBol()
		  {
		  System.out.println("Hare Krsna!");
		  }
	  };
	  
	  public static void main(String []args)
	  {
		  Anonymous Ann = new Anonymous();
		  Ann.g.Bol_HariBol();
	  }
  }