package fundamentals;

import java.util.Scanner;

public class FindPowerOfaNumber {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner(System.in);
  	   double a,b,c;
  	   System.out.print("Enter base: ");
  	   a=x.nextDouble();
  	 System.out.print("Enter exponent: ");
  	   b=x.nextDouble();
  	   c=Math.pow(a, b);
  	   System.out.println(a+"^" +b+"= "+c);
     }
}
