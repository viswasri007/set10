import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pr=1;
		while(n!=0)
		{
			int rem=n%10;
			pr=pr*rem;
			n=n/10;
		}
		System.out.print(pr);
	}
}
