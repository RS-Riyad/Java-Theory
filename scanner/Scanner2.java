package scanner;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter radius : ");
		float a=x.nextFloat();
		System.out.print("Area of circle :" +(3.1416*a*a));
	}
}
