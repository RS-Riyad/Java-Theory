package if_else;

import java.util.Scanner;

public class CheckAlphabetDigit_or_SpecialCharacter {
	 public static void main(String[] args)
     {
  	   Scanner x=new Scanner (System.in);
  	   System.out.print("Enter any character: ");
  	   char ch=x.next().charAt(0);
  	   if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))
  		   System.out.print(ch+ " is alphabet.");
  	   else if (ch >= '0' && ch <= '9')
  		   System.out.print(ch+ " is digit.");
  	   else
  		   System.out.print(ch+ " is special character.");
     }
}
