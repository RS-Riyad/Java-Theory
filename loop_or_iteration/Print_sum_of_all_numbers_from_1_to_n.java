package loop_or_iteration;

import java.util.Scanner;

public class Print_sum_of_all_numbers_from_1_to_n {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner(System.in);
  	   System.out.print("Input upper limit: ");
  	   int a=x.nextInt();
  	   int sum=0;
  	   for (int i=1;i<=a;i++)
            sum=sum+i;
  	 System.out.print("Sum of first 10 natural numbers = " +sum);
  	   }
}
