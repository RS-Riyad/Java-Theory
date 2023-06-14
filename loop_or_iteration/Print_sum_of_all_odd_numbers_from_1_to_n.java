package loop_or_iteration;

import java.util.Scanner;

public class Print_sum_of_all_odd_numbers_from_1_to_n {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner(System.in);
  	   System.out.print("Input lower limit: ");
  	   int l=x.nextInt();
  	 System.out.print("Input upper limit: ");
	   int u=x.nextInt();
  	   int sum=0;
  	   for (int i=l;i<=u;i++)
  	   {
  		   if (i%2!=0)
            sum=sum+i;
  	   }
  	 System.out.print("Sum of odd numbers between " +l+ " to " +u+ " = " +sum);
  	   }
}
