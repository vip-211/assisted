package com.feb.project;

public class LongInc {
	static int max_ref;
	static int lis(int acc[],int n)
	{
		if(n==1) {
		return 1;
		}
		int res,max_end= 1;
		for(int i= 1;i<n;i++)
		{
			res =lis(acc,i);
			if(acc[i-1]<acc[n-1] && res+1>max_end)
			{
				max_end =res+1;
				
			}
			if (max_ref < max_end)
				max_ref = max_end;
		}
		//return max_end;
		return max_end;
		
		}
	static int lis1(int acc[], int n)
	{
		max_ref=1;
		lis1(acc,n);
		return max_ref;
	}
	public static void main(String args[])
	{
	int acc[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
	int n = acc.length;
	System.out.println("Length of Long increasing sequence is " + lis(acc, n)
	+ "\n");
	}
	}
	


