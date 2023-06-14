package loop_or_iteration;
import java.util.Scanner;

public class Find_number_of_digits_in_a_number {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   System.out.print("Enter any number: ");
    	   long a=x.nextLong();
    	   int c=0;
    	   if(a==0)
    		   c=1;
    	   else
    	   {
    		   for (long i=a;i!=0;i=i/10)
    			   ++c;
    	   }
    	   System.out.print("Total digits: " +c);
       }
}
