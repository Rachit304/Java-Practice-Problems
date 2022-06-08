//(12). Write a program to sort the elements of one dimensional array. Read value of array elements through command line argument.

class Main
{
	static public void main(String args[])
	{
		int i,j;
		int a[]=new int[args.length];
		if(args.length==0)
		{	
			System.out.println("Please provide Arguments");
			System.exit(0);
		}
		else
		{
			for(i=0;i<args.length;i++)
			{
				a[i]=Integer.parseInt(args[i]);
			}
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<i;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
	}
}