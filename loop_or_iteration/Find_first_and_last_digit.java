package loop_or_iteration;

import java.util.Scanner;

public class Find_first_and_last_digit {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner(System.in);
  	   System.out.print("Enter any number: ");
       int a=x.nextInt();
       int c=0;
       for(int i=a; i!=0; i=i/10)
       { c=i;}
       System.out.println("First digit = " +c);
       System.out.print("Last digit = " +(a%10));
     }
}
