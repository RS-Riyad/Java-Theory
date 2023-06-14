package fundamentals;

import java.util.Scanner;

public class LengthConversion {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	
    	   double a,b,c;
    	   System.out.print("Enter length in centimeter = ");
    	   a=x.nextInt();
    	   b=a/100;
    	   c=a/100000;
    	   System.out.println("Length in meter =" +(b)+ " m");
    	   System.out.println("Length in kilometer =" +(c)+ " km");
       }
}
