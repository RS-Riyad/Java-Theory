package if_else;

import java.util.Scanner;

public class CheckUppercase_or_Lowercase {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner (System.in);
  	   System.out.print("Enter any character: ");
  	   char ch=x.next().charAt(0);
  	   if((ch >= 'a') && (ch <= 'z'))
  		   System.out.print(ch+ " is lowercase alphabet.");
  	   else if ((ch >= 'A') && (ch <= 'Z'))
  		   System.out.print(ch+ " is uppercase alphabet.");
     }
}
