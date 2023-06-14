package fundamentals;

import java.util.Scanner;

public class CalculateCompoundInterest {
	public static void main(String[] args)
	 {
  	   Scanner x=new Scanner (System.in);
  	   double p,n,r,a;
  	   System.out.print("Enter principle (amount): ");
  	   p=x.nextDouble();
  	   System.out.print("Enter time: ");
  	   n=x.nextDouble();
  	   System.out.print("Enter rate: ");
  	   r=x.nextDouble();
  	   a=p* (Math.pow((1 + r / 100), n));
  	   System.out.print("Compound Interest : " +a);
     }
}
