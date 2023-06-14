package inheritance_4;

public class MyCalculation extends Calculation{

	
	public void multiplication(int a, int b)
	{
		z=a*b;
		System.out.println("The Multiplication : " +z);
	}
	
	public void division(int a, int b)
	{
		z=a/b;
		System.out.println("The Division : " +z);
	}
	
	public static void main(String[] args)
	{
		MyCalculation x=new MyCalculation();
		x.addition(5, 6);
		x.subtraction(5, 6);
		x.multiplication(5, 6);
		x.division(10, 2);
		
	
	}
}
