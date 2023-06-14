package loop_or_iteration;

import java.util.Scanner;

public class Print_alphabets_from_a_to_z {
	 public static void main(String[] args)
     {
  	   char ch;
  	   System.out.println("Alphabets from a - z are: " );
  	   for (ch='a';ch<='z';ch++)
  	   {
  		   if (ch<'z')
  		   System.out.print(ch+",");
  		   else
  			   System.out.print(ch);
     }
  	   }
}

