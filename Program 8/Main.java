//(8) Write a java program which will check whether the string is palindrom or not without using reverse(). String has to be accepted from the user.

import javax.swing.*;
class Main
{
	public static void main(String a[])
	{
		String str;
		str=JOptionPane.showInputDialog(null,"Enter the Statement: ","Enter the Statement",JOptionPane.QUESTION_MESSAGE);
		StringBuffer sb= new StringBuffer(str);
		
		int len=sb.length();
		int start_count=0,end_count=len-1,count=0;

		for(int i=0;i<len;i++)
		{
			char let=sb.charAt(start_count);
			char let1=sb.charAt(end_count);
		
			if(let==let1)
			{
				count++;
			}
			start_count++;
			end_count--;			
		}

		if(count==len)
		{
			System.out.println("The string is Palindrome");
		}
		else
			System.out.println("The string is not Palindrome");
	}
}

