package fundamentals;

import java.util.Scanner;

public class CalculateSimpleInterest {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner (System.in);
    	   float p,n,r;
    	   System.out.print("Enter principle (amount): ");
    	   p=x.nextFloat();
    	   System.out.print("Enter time: ");
    	   n=x.nextFloat();
    	   System.out.print("Enter rate: ");
    	   r=x.nextFloat();
    	   System.out.print("Simple Interest: " +((p*n*r)/100));
       }
}
