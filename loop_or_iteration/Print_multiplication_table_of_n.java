package loop_or_iteration;

import java.util.Scanner;

public class Print_multiplication_table_of_n {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   System.out.print("Enter number to print table of: ");
    	   int a=x.nextInt();
    	   for(int i=1;i<=10;i++)
    	   {
    		   System.out.println(a+ " * " +i+ " = " +(a*i));
    	   }
       }
}
