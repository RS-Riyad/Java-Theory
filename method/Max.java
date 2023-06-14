package method;
//method overloading
public class Max {

	public int max(int a1, int a2)
	{
		if (a1>a2)
			return a1;
		else 
			return a2;
	}
	
	public int max(int b1, int b2, int b3)
	{
		if ((b1>b2) && (b1>b3))
			return b1;
		else if ((b2>b1) && (b2>b3))
			return b2;
		else 
			return b3;
	}
	
	public double max (double a1, double a2)
	{
		if(a1>a2)
			return a1;
		else
			return a2;
	}
	
	public static void main(String[] args)
	{
		Max x=new Max();
		System.out.println("Max1 : "+x.max(5, 6));
		System.out.println("Max1 : "+x.max(5, 6, 7));
		System.out.println("Max1 : "+x.max(2.342, 2.2424));
	}
}
