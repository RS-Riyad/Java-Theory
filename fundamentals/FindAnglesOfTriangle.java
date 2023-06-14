package fundamentals;

import java.util.Scanner;

public class FindAnglesOfTriangle {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   int a,b;
    	   System.out.print("Enter first angle: ");
    	   a=x.nextInt();
    	   System.out.print("Enter second angle: ");
    	   b=x.nextInt();
    	   System.out.print("Third angle: " +(180-(a+b)));
       }
}
