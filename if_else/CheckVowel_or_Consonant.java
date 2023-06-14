package if_else;

import java.util.Scanner;

public class CheckVowel_or_Consonant {
	public static void main(String[] args)
    {
 	   Scanner x=new Scanner(System.in);
 	   System.out.print("Enter any character: ");
 	   char ch=x.next().charAt(0);
 	   if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
 		   System.out.println(ch+" is vowel");
 	   else
 		  System.out.println(ch+ " is Consonant");
    }
}
