package if_else;

import java.util.Scanner;

public class CalculateProfileOR_Loss {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter cost price: ");
 	   int a=x.nextInt();
 	  System.out.print("Enter selling price: ");
 	   int b=x.nextInt();
 	   if (a>b)
 		   System.out.println("Loss = "+(a-b));
 	   else if (b>a)
 		   System.out.println("Profit = "+(b-a));
 	  else
		   System.out.println("No Profit No Loss");
    }
}
