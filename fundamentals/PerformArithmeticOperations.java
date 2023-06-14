package fundamentals;

import java.util.Scanner;

public class PerformArithmeticOperations {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   float a, b,d;
    	   System.out.print("Enter two Number: ");
    	   a=x.nextInt();
    	   b=x.nextInt();
    	   d=a/b;
    	   System.out.println("SUM: " +(a+b));
    	   System.out.println("DIFFERENCE: "+(a-b));
    	   System.out.println("PRODUCT: " +(a*b));
    	   System.out.println("QUOTIENT: " +d);
    	   System.out.println("MODULUS: " +(a%b));
       }
}
