package if_else;

import java.util.Scanner;

public class FindNumber_of_Days_in_Month {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter month number (1-12): ");
 	   int a=x.nextInt();
 	   if (a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
 		   System.out.println("31 days");
 	   else if (a==4 || a==6 || a==9 || a==11)
 		   System.out.println("30 days");
 	  else if (a==2)
 		  System.out.print("28 or 29 days");
 	  else
 		 System.out.print("Invalid input! Please enter month number between (1-12).");
    }
}
