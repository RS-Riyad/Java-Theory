package method;
//using static
public class Method2 {

	public static void main(String[] args)
	{
		int a=10;
		int b=7;
		System.out.print("max : " +max(a,b));
	}
	
	public static int max(int n1, int n2)
	{
		if (n1<n2)
			return n2;
		else
			return n1;
	}
}
