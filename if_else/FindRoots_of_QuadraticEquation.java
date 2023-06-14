package if_else;

import java.util.Scanner;

public class FindRoots_of_QuadraticEquation {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter values of a, b, c of quadratic equation (aX^2 + bX + c): ");
 	   double a=x.nextDouble();
 	   double b=x.nextDouble();
 	   double c=x.nextDouble();

 	    double discriminant= b*b-4*a*c;
 	    if (discriminant>0) 
 	    {
 	      double root1=(-b+Math.sqrt(discriminant)) / (2*a);
 	      double root2=(-b-Math.sqrt(discriminant)) / (2*a);
 	      System.out.println("Two distinct and real roots exists: " + root1+ " and "+ root2);
 	    }
 	    else if (discriminant==0) 
 	    {
 	      double root =-b/(2*a);
 	      System.out.println("Two equal and real roots exists: " + root+ "and" +root);
 	    }
 	   else if (discriminant < 0) {
 		  double realPart = -b / (2 * a);
 		  double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
 		  System.out.println("Two distinct complex roots exist: " + realPart + "+i" + imaginaryPart + " and " + realPart + "-i" + imaginaryPart);
 		}

 	  }
 	}