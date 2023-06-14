package fundamentals;

import java.util.Scanner;

public class FindAreaAndPerimeterOfRectangle {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   float a,b;
    	   System.out.print("Enter length of rectangle: ");
    	   a=x.nextFloat();
    	   System.out.print("Enter width of rectangle: ");
    	   b=x.nextFloat();
    	   System.out.print("Area of rectangle: "+(a*b)+ "sq. units");
       }
}
