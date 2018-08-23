import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int j=0;
		for(int i=1;i<=n;i++)
		{
			if(i!=a[j++])
			{
				System.out.print(i);
				break;
			}
		}
	}
}
