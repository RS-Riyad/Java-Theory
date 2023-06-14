package loop_or_iteration;

import java.util.Scanner;

public class Print_natural_numbers_from_1_to_n {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   System.out.print("Input upper limit: ");
    	   int i=1;
    	   int a=x.nextInt();
    	   System.out.print("Natural numbers from 1 to "+a+":" );
    	   for (i=1;i<=a;i++)
    	   {
    		   if (i<a)
    		   System.out.print(i+",");
    		   else
    			   System.out.print(i);
       }
    	   }
}
