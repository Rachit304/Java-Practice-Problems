//(7)Write a java program which will accept one string from the user and display individual vowel count of each vowel as well as total vowels.

import javax.swing.*;
class Main
{
	public static void main(String a[])
	{
		String str;
		str=JOptionPane.showInputDialog(null,"Enter the Statement: ","Enter the Statement",JOptionPane.QUESTION_MESSAGE);
		StringBuffer sb= new StringBuffer(str);
	
		int len=sb.length();
		int a_count=0,e_count=0,i_count=0,o_count=0,u_count=0,total_count=0;

		for(int i=0;i<len;i++)
		{
			char let=sb.charAt(i);
			switch(let)
			{
				case 'a':a_count++;break;
				case 'A':a_count++;break;

				case 'e':e_count++;break;
				case 'E':e_count++;break;

				case 'i':i_count++;break;
				case 'I':i_count++;break;

				case 'o':o_count++;break;
				case 'O':o_count++;break;

				case 'u':u_count++;break;
				case 'U':u_count++;break;
			}

		}
		total_count=a_count+i_count+e_count+o_count+u_count;

		System.out.println("\nThe total vowels of a are :"+a_count);
		System.out.println("The total vowels of e are :"+e_count);
		System.out.println("The total vowels of i are :"+i_count);
		System.out.println("The total vowels of o are :"+o_count);
		System.out.println("The total vowels of u are :"+u_count);
		System.out.println("\nThe total No. of vowels are : "+total_count);
	}
}