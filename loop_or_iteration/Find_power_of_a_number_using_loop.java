package loop_or_iteration;

import java.util.Scanner;

public class Find_power_of_a_number_using_loop {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner(System.in);
  	   System.out.print("Enter base: ");
  	   long a=x.nextLong();
  	 System.out.print("Enter exponent: ");
  	   long b=x.nextLong();
  	   long sum=1;
  		   for (int i=1;i<=b;i++)
  			   sum=sum*a;
  	   System.out.print(a+" ^ "+b+ " = " +sum);
     }
}
