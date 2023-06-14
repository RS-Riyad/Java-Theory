package Codeforce;

import java.util.Scanner;

public class AntonandDanik {
	public static void main(String[] args)
	{
		Scanner x=new Scanner (System.in);
		int a,i,j=0,k=0;
		String s;
		a=x.nextInt();
		s=x.next();
		for(i=0;i<a;i++)
		{
			if(s.charAt(i)=='A')
				j++;
			else if (s.charAt(i)=='D')
				k++;
		}
		if (j>k)
			System.out.print("Anton\n");
		if (j==k)
			System.out.print("Friendship\n");
		else if (j<k)
			System.out.print("Danik\n");
					
	}

}
