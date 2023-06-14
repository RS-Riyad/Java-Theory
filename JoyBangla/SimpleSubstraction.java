package JoyBangla;

import java.util.Scanner;

public class SimpleSubstraction {public static void main(String[] args)
	{
	Scanner x=new Scanner (System.in);
	int a,b,i;
	a=x.nextInt();
	b=x.nextInt();
	for(i=1;i<=b;i++)
	{
		if (a%10==0)
		{
			a=a/10;
		}
		else
		{
			a=a-1;
		}
		}
	System.out.print("Result: " +a);
	}
	}

