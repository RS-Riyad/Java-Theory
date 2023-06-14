package exception;

public class Finally {
	public static void main(String[] args)
	{
		try
		{
			int a=50/0;
		}
		
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Forca Barca");
		}
		System.out.println("Hala Madrid");
	}
}

