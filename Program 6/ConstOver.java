/*

6)Write a java program to create a class Circle. 
	It should have three int members x,y(center co-ordinates) and radius. 
	Program should contain three constructors. 
	First no argument constructor should initialize center at origin with radius 1. 
	Second single argument constructor accepts the value of radius and should be centered at origin. 
	Third constructor should accept three arguments and initialize all three members with them respectively. 
	Also write an appropriate main method to demonstrate the use of each constructor.
*/

import javax.swing.*;
class ConstOver
{
	public static void main(String a[])
	{
		
		float r2,x1,y1,r3;
		String str1,str2;

		str1=JOptionPane.showInputDialog(null,"Enter the Radius for 2nd Const : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
		r2=Float.parseFloat(str1);
	
		str2=JOptionPane.showInputDialog(null,"Enter the Value of x : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
		x1=Float.parseFloat(str2);
	
		str2=JOptionPane.showInputDialog(null,"Enter the Value of y : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
		y1=Float.parseFloat(str2);

		str2=JOptionPane.showInputDialog(null,"Enter the Value of r : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
		r3=Float.parseFloat(str2);
	
		float val;

		Circle c1=new Circle();
		Circle c2=new Circle(r2);
		Circle c3=new Circle(x1,y1,r3);
		
		val=c3.area();	
		c3.display();
		System.out.println("Ans is : "+val);
	}
}

class Circle
{
	final float PI=3.14f;

	float x,y,r;
	Circle()
	{
		x=0;
		y=0;
		r=1;
	}
	Circle(float r1)
	{
		x=0;
		y=0;
		r=r1;
	}
	Circle(float num1,float num2,float num3)
	{
		x=num1;
		y=num2;
		r=num3;
	}
	float area()
	{
		return(PI*r*r);
	}
	void display()
	{
		System.out.println("Local Variables are x = : " + x + " Values of y is : " + y + " Value of r is : " + r );
	}
}