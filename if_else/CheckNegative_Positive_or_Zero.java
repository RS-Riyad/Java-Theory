package if_else;

import java.util.Scanner;

public class CheckNegative_Positive_or_Zero {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter any number : ");
 	   int a=x.nextInt();
 	   if (a>0)
 		   System.out.println("Number is POSITIVE");
 	   else if (a<0)
 		   System.out.println("Number is NEGATIVE");
 	   else
 		  System.out.println("Number is ZERO");
    }
}
