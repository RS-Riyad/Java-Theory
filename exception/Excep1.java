package exception;

public class Excep1 {
	public static void main(String[] args)
	{
		try
		{
			int a=50/0;
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Exception occured!!");
		}
		System.out.println("Hala Madrid");
	}
}