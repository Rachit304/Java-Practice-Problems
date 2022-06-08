//15. Write a java program which will display the following triangle:

class Main
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(" "+i);
			System.out.println();
		}
	}
}