package fundamentals;

import java.util.Scanner;

public class FindDiameterAndAreaOfCircle {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner (System.in);
    	   float r;
    	   System.out.print("Enter radius: ");
    	   r=x.nextFloat();
    	   System.out.println("Diameter: " +(2*r) + " units");
    	   System.out.println("Circumference: "+(2*r*3.1416) + " units");
    	   System.out.println("Area: " +(3.1416*r*r) + " "
    	   		+ "sq. units");
       }
}
