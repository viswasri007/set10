import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		int h=s.nextInt();
		if(l>0 && b>0 && h>0)
		{
			System.out.print(2*(l*b+b*h+h*l));
			System.out.print(" "+(l*b*h));
		}
		else
		{
			System.out.print("Invalid Inputs");
		}
	}
}
