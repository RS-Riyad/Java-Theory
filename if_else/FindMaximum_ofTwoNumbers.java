package if_else;

import java.util.Scanner;

public class FindMaximum_ofTwoNumbers {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   System.out.print("Enter two numbers : ");
    	   int a=x.nextInt();
    	   int b=x.nextInt();
    	   if (a>b)
    		   System.out.println(a+ " is maximum");
    	   else if (a<b)
    		   System.out.println(b+ " is maximum");
       }
}
