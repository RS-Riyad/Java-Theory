package loop_or_iteration;

import java.util.Scanner;

public class Print_even_numbers_from_1_to_n {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner(System.in);
  	   System.out.print("Input upper range: ");
  	   int a=x.nextInt();
  	   System.out.print("Even numbers between 1 to "+a+":" );
  	   for (int i=2;i<=a;i=i+2)
  	   {
  		   if (i<a)
  		   System.out.print(i+",");
  		   else
  			   System.out.print(i);
           }
  	   }
  	 
}
