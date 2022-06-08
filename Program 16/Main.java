/*
(16)Write a menu drivenJava program which performs the following on a given string : [Accept the string using command line argument]
(i) Reverse the string.
(ii) Convert all the lowercase letters to uppercase.
(iii) Find the length of the string.
(iv) Print the first and last characters of the string. 
*/

import javax.swing.*;
class Main
{
	public static void main(String args[])
	{
		int opt,ch;
		String temp=args[0];

		//String newtemp;

		if(args.length==0)
		{
			System.out.println("Please provide arguments ");
			System.exit(0);
		}
		else
		{	
			System.out.println("Enter 1 to Reverse the string");
			System.out.println("Enter 2 to Convert all the lowercase letters to uppercase");
			System.out.println("Enter 3 to Find the length of the string.");
			System.out.println("Enter 4 to Print the first and last characters of the string\n");

			ch=1;

			while(ch==1)
			{
				
				opt=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Option  :"));
				StringBuffer sb= new StringBuffer(args[0]);

				switch(opt)
				{
					case 1:{
						sb=sb.reverse();
						System.out.println("\n"+sb);
						
						break;}
					case 2:{
						temp=temp.toUpperCase();
						System.out.println("\n"+temp);

						break;}
					case 3:{
						System.out.println("\n"+args[0].length());
						break;}
					case 4:{
						System.out.println("\nFirst Char is : "+sb.charAt(0)+" Second Char is : "+sb.charAt(sb.length()-1));

						break;}
					default:{
							System.out.println("Program Terminated Successfully");
							System.exit(0);
						}
				}
				ch=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the 1 for continue and 0 to exit  :"));				
			}
							System.out.println("\nProgram Terminated Successfully");
		}
	}
}