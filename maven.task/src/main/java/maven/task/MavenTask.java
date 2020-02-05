package maven.task;
import java.io.*;
import java.util.*;
public class MavenTask {
	public static void main(String Args[])
	{
		Scanner o=new Scanner(System.in);
		int n=o.nextInt(),w=0;
		String a[]=new String[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=o.next();
			b[i]=o.nextInt();
			w=w+b[i];
		}
		int k;
		System.out.println("1.sort by name\n2.sort by weight\nenter choice :\n");
		k=o.nextInt();
		switch(k)
		{
		case 1:
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n-1;j++)
				{
					if(a[j+1].compareTo(a[j])>0)
					{
						String ss=a[j+1];
						a[j+1]=a[j];
						a[j]=ss;
						
						int tt=b[j+1];
						b[j+1]=b[j];
						b[j]=tt;
					}
				}
			}
			
			for(int i=0;i<n;i++)
				System.out.println(a[i]+"	"+b[i]);
			break;
		case 2:
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n-1;j++)
				{
					if(b[j+1]>b[j])
					{
						String ss=a[j+1];
						a[j+1]=a[j];
						a[j]=ss;
						
						int tt=b[j+1];
						b[j+1]=b[j];
						b[j]=tt;
					}
				}
			}
			
			for(int i=0;i<n;i++)
				System.out.println(a[i]+"	"+b[i]);
			break;
			
		}
		System.out.println("Total weight = "+w);
		
	}
}
