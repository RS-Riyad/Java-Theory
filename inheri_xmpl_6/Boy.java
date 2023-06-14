package inheri_xmpl_6;

public class Boy extends Human{

	public void eat()
	{
		System.out.println("Boy eats.");
	}
	
	public static void main(String[] args)
	{
		 Boy x=new Boy();
		x.eat();
	}
}

