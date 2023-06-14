package fundamentals;
import java.util.Scanner;
public class BasicIOonAllDataTypes {
	public static void main(String[] args) 
	  {
	    Scanner x=new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int numInt =x.nextInt();	    
	    System.out.print("Enter a float: ");
	    float numFloat =x.nextFloat();	    
	    System.out.print("Enter a double: ");
	    double numDouble =x.nextDouble();	    
	    System.out.print("Enter a character: ");
	    char ch =x.next().charAt(0);	    
	    System.out.print("Enter a string: ");
	    String str =x.next();
	    
	    System.out.println("\nInteger: " + numInt);
	    System.out.println("Float: " + numFloat);
	    System.out.println("Double: " + numDouble);
	    System.out.println("Character: " + ch);
	    System.out.println("String: " + str);
	  }
}