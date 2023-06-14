package if_else;

import java.util.Scanner;

public class FindMaximum_ofThreeNumbers {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter three numbers : ");
 	   int a=x.nextInt();
 	   int b=x.nextInt();
 	   int c=x.nextInt();
 	   if (a>b && a>c)
 		   System.out.println("Maximum among all three numbers = " +a);
 	   else if (a<b && b>c)
 		   System.out.println("Maximum among all three numbers = " +b);
 	   else
 		  System.out.println("Maximum among all three numbers = " +c);
    }
}
