package fundamentals;

import java.util.Scanner;

public class FindSquareRoot {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   double a,c;
 	   System.out.print("Enter any number to find square root: ");
 	   a=x.nextDouble();
 	   c=Math.sqrt(a);
 	   System.out.printf("Square root of " +a+ "= " +c);
    }
}
