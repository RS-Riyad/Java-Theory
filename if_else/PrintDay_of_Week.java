package if_else;

import java.util.Scanner;

public class PrintDay_of_Week {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter week number (1-7): ");
 	   int a=x.nextInt();
 	   if (a==1)
 		   System.out.println("Monday");
 	   else if (a==2)
 		   System.out.println("Tuesday");
 	  else if (a==3)
		   System.out.println("Wednesday");
 	 else if (a==4)
		   System.out.println("Thursday");
 	 else if (a==5)
		   System.out.println("Friday");
 	 else if (a==6)
		   System.out.println("Saturday");
 	 else if (a==7)
		   System.out.println("Sunday");
    }
}
