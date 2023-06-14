package loop_or_iteration;

import java.util.Scanner;

public class Find_sum_of_first_and_last_digit {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter any number to find sum of first and last digit: ");
      int a=x.nextInt();
      int c=0;
      int l=a%10;
      for(int i=a; i!=0; i=i/10)
      { c=i;}
      System.out.println("Sum of first and last digit = " +(l+c));
    }
}
