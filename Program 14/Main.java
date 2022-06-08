class Main
{
	public static void main(String args[])
	{
		int i,j,count,j1=0;
		int a[]=new int[args.length];
		int a1[]=new int[20];
		if(args.length==0)
		{	
			System.out.println("Please provide Arguments");
			System.exit(0);
		}
		else
		{
			if(args.length>1)
			{
				System.out.println("Please enter only one arguments");
				System.exit(0);
			}
			else
			{
				a[0]=Integer.parseInt(args[0]);
				if(a[0]<0)
				{
					System.out.println("Please enter the no. greater than 0");
					System.exit(0);
				}
				else
				{
					for(i=1;i<=a[0];i++)
					{
						
						if(a[0]%i==0)
						{	
								System.out.print("\t"+i);
			
						}
					}
				}
			}
		}
	}
}