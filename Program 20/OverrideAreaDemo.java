import javax.swing.*;
class OverrideAreaDemo
{
	public static void main(String a[])
	{
		int l,b,s;
		
		l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Lenght of Rectangle"));
		b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Breadth of Rectangle"));
		Rectangle robj=new Rectangle(l,b);
		robj.display();

		s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Side of Square"));
		Square sobj=new Square(s);
		sobj.display();
	}
}

abstract class Shape
{
	abstract int area();
}

class Rectangle extends Shape
{
	int l,r;
	Rectangle(int l1,int r1)
	{
		this.l=l1;
		this.r=r1;
	}
	int area()
	{
		return(l*r);
	}
	void display()
	{
		System.out.println("Lenght is : "+l);
		System.out.println("Breadth is : "+r);
		System.out.println("area is : "+area());		
	}
}

class Square extends Shape
{
	int s;
	Square(int s1)
	{
		this.s=s1;
	}
	int area()
	{
		return(s*s);
	}
	void display()
	{
		System.out.println("\nSide of Square is : "+s);
		System.out.println("area is : "+area());		
	}
}