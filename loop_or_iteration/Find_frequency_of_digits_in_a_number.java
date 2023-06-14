package loop_or_iteration;
import java.util.Scanner;
public class Find_frequency_of_digits_in_a_number {
       public static void main(String[] args)
       {
    	  Scanner x=new Scanner(System.in);
    	  System.out.print("Enter any number: ");
    	  int a=x.nextInt();
    	  int a0=0;
    	  int a1=0;
    	  int a2=0;
    	  int a3=0;
    	  int a4=0;
    	  int a5=0;
    	  int a6=0;
    	  int a7=0;
    	  int a8=0;
    	  int a9=0;
    	  System.out.print("Frequency of each digit in "+a+ " is:");
    	  for (int i=a; i!=0; i=i/10)
    	  {
    		  int c=i%10;
    		  if (c==0)
    			  a0++;
    		  if (c==1)
    			  a1++;
    		  if (c==2)
    			  a2++;
    		  if (c==3)
    			  a3++;
    		  if (c==4)
    			  a4++;
    		  if (c==5)
    			  a5++;
    		  if (c==6)
    			  a6++;
    		  if (c==7)
    			  a7++;
    		  if (c==8)
    			  a8++;
    		  if (c==9)
    			  a9++;
    	  }
    	  System.out.println("Frequency of 0 = "+a0);
    	  System.out.println("Frequency of 1 = "+a1);
    	  System.out.println("Frequency of 2 = "+a2);
    	  System.out.println("Frequency of 3 = "+a3);
    	  System.out.println("Frequency of 4 = "+a4);
    	  System.out.println("Frequency of 5 = "+a5);
    	  System.out.println("Frequency of 6 = "+a6);
    	  System.out.println("Frequency of 7 = "+a7);
    	  System.out.println("Frequency of 8 = "+a8);
    	  System.out.println("Frequency of 9 = "+a9);
       }
}
