package scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args)
	{
		Scanner x= new Scanner(System.in);
		System.out.print("Enter first number :");
		int a=x.nextInt();
		System.out.print("Enter second number :");
		int b=x.nextInt();
		System.out.print("Sum of two numbers :" +(a+b));
	}
}
