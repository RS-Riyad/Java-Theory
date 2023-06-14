package fundamentals;

import java.util.Scanner;

public class DaysConversion {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner(System.in);
    	   int a,y,w,d;
    	   System.out.print("Enter days: ");
    	   a=x.nextInt();
    	   y=a/365;
    	   w=(a-(y*365))/7;
    	   d=(a-((y*365)+(w*7)));
    	   System.out.println("YEARS: "+y);
    	   System.out.println("WEEKS: "+w);
    	   System.out.println("DAYS: "+d);
       }
}
