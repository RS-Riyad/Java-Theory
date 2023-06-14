package if_else;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Input year: ");
 	   int a=x.nextInt();
 	   if ((a%4==0 && a%100!=0) || a%400==0)
 		   System.out.println("LEAP YEAR");
 	   else 
 		   System.out.println("COMMON YEAR");
    }
}
