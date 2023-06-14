package if_else;
import java.util.Scanner;

public class CheckAlphabetCharacter {
       public static void main(String[] args)
       {
    	   Scanner x=new Scanner (System.in);
    	   System.out.print("Enter any character: ");
    	   char ch=x.next().charAt(0);
    	   if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))
    		   System.out.print("Character is an ALPHABET.");
    	   else
    		   System.out.print("Character is an not ALPHABET.");
       }
}
