package loop_or_iteration;

import java.util.Scanner;

public class Find_sum_of_digits_of_a_number {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter any number to find sum of its digit: ");
      int a=x.nextInt();
      int c=0;
      int s=0;
      for(int i=a; i!=0; i=i/10)
      { 
    	  c=i%10;
    	  s=s+c;
      }
      System.out.println("Sum of digits = " +s);
    }

}
