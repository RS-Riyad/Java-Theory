package method;

import java.util.Scanner;   //without using static

public class Method1 {

	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter two num : ");
		int a=x.nextInt();
		int b=x.nextInt();
		Method1 x1=new Method1();
		System.out.print("Max : "+x1.max(a, b));
	}
	
	public int max(int num1, int num2)
	{
		if(num1>num2)
		{
			return num1;
		}
		else 
		{return num2;}
	}
}
