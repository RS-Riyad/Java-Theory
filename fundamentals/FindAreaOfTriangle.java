package fundamentals;

import java.util.Scanner;

public class FindAreaOfTriangle {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   float a,b;
    	   System.out.print("Enter base of the triangle: ");
    	   a=x.nextFloat();
    	   System.out.print("Enter height of the triangle: ");
    	   b=x.nextFloat();
    	   System.out.print("Area of the triangle: " +((a*b)/2)+ " sq. units");
       }
}
