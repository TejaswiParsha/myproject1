import java.util.*;
class sort
{
	public static void main(String args[])
	{
		int l=args.length;
		int i,j;
		for(i=0;i<l;i++)
		{
			for(j=i+1;i<l-i-1;j++)
			{
				if(args[i].compareTo(args[j])>0)
				{
					String temp=args[j];
					args[j]=args[j+1];
					args[j+1]=temp;
				}
			}
			System.out.println(args[i]);
		}
	}
}