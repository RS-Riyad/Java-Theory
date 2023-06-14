package fundamentals;

import java.util.Scanner;

public class TemperatureConversion {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   int a;
    	   System.out.print("Enter temperature in Celsius = ");
    	   a=x.nextInt();
    	   System.out.print("Temperature in Fahrenheit =" +((a*9/5)+32)+ " F");
       }
}
