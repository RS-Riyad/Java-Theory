package if_else;

import java.util.Scanner;

public class CheckDivisibility {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   System.out.print("Enter any number: ");
    	   int a=x.nextInt();
    	   if (a%5==0 && a%11==0)
    		   System.out.println("Number is divisable by 5 and 11");
    	   else 
    		   System.out.println("Number is not divisible by 5 and 11");
       }
}
