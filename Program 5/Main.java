// (5)Write a program to calculate the area of square and rectangle by overloading the area method.
//The area method should be static. 
//The values required for square and rectangle should be accepted from the user.

import javax.swing.*;

public class Main
{
	static int s,l,b,area_sqr,area_rect;
	public static void main(String args[])
	{		
 		String str1,str2,str3;	
	
		str1=JOptionPane.showInputDialog(null,"Enter the Side of the Square : ","Area",JOptionPane.QUESTION_MESSAGE);
		s=Integer.parseInt(str1);

		str2=JOptionPane.showInputDialog(null,"Enter the Length of the Rectangle : ","Area",JOptionPane.QUESTION_MESSAGE);
		l=Integer.parseInt(str2);

		str3=JOptionPane.showInputDialog(null,"Enter the Breadth of the Rectangle : ","Area",JOptionPane.QUESTION_MESSAGE);
		b=Integer.parseInt(str3);
	
		area(s);
		area(l,b);
		display();

	}
	static void  area(int s)
	{
		area_sqr=s*s;
	}	
	static void area(int l, int b)
	{
		area_rect=l*b;
	}	
	static void display()
	{
		JOptionPane.showMessageDialog(null,"The area of Sqaure is " +area_sqr);
		JOptionPane.showMessageDialog(null,"The area of Rectangle is " +area_rect);
	}
}