package loop_or_iteration;

import java.util.Scanner;

public class Swap_first_and_last_digit {
	public static void main(String[] args)
{
		 Scanner x =new Scanner(System.in);
		 System.out.print("Enter any number: ");
		  int a= x.nextInt();
		  System.out.println("Original number = " +a);
		 int remainder,reverse=0;
		 while (a!= 0) {
		    remainder = a % 10;
		    reverse = reverse * 10 + remainder;
		    a/= 10;
		  }

		  System.out.print("Number after swapping first and last digit: " +reverse);

	}

}
