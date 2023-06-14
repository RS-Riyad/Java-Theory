package fundamentals;

import java.util.Scanner;

public class BasicInputOutput {
       public static void main(String [] args)
       {
    	   Scanner x=new Scanner (System.in);
    	   int a,b;
    	   System.out.print("Enter two Number : ");
    	   a=x.nextInt();
    	   b=x.nextInt();
    	   System.out.print("Summation : " +(a+b));
       }
}
