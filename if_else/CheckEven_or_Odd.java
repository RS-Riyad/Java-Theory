package if_else;

import java.util.Scanner;

public class CheckEven_or_Odd {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner(System.in);
  	   System.out.print("Enter any number to check even or odd: ");
  	   int a=x.nextInt();
  	   if (a%2==0)
  		   System.out.println("Number is Even");
  	   else 
  		   System.out.println("Number is Odd");
     }
}
