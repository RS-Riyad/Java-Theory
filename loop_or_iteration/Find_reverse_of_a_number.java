package loop_or_iteration;

import java.util.Scanner;

public class Find_reverse_of_a_number {
	public static void main(String[] args) 
	{
		 Scanner x=new Scanner(System.in);
	     System.out.print("Enter any number to find reverse: ");
	     int a= x.nextInt();
	     int reverse = 0;
	     int originalNum = a;
	     while (a!= 0) {
	         reverse = reverse *10 +a % 10;
	         a/= 10;
	     }
	     System.out.println("Reverse = " +reverse);
	  }
	}



