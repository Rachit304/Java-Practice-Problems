class Main1
{
	public static void main(String args[])
	{
		int i,j,count=0;
		for(i=1;i<=500;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		
		if(count==2)
		{
			int rev=0,temp,p=i,prime=i;
			while(p!=0)
			{
				temp=p%10;
				rev=rev*10+temp;
				p=p/10;
				if(rev==prime)
				{
					System.out.print("\t"+prime);
				}
			}
		}
	}
}
}