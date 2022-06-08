import javax.swing.*;
class Calc
{
	public static void main(String a[])
{
	int real,imag;
	String str1,str2;
	str1=JOptionPane.showInputDialog(null,"Enter the Real no. : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
	real=Integer.parseInt(str1);
	str2=JOptionPane.showInputDialog(null,"Enter the Imaginary no. : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
	imag=Integer.parseInt(str2);

	Complex c1=new Complex(real,imag);

	str1=JOptionPane.showInputDialog(null,"Enter the Real no. : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
	real=Integer.parseInt(str1);
	str2=JOptionPane.showInputDialog(null,"Enter the Imaginary no. : ","Enter the No.",JOptionPane.QUESTION_MESSAGE);
	imag=Integer.parseInt(str2);

	Complex c2=new Complex(real,imag);

	Complex c3= new Complex();
		c3=c1.add(c1,c2);
	System.out.println("Addition is "+c3.real+"+"+c3.imag+"i");

	Complex c4= new Complex();
		c4=c1.sub(c1,c2);
	System.out.println("Substraction is "+c4.real+"+"+c4.imag+"i");

	Complex c5= new Complex();
		c5=c1.mul(c1,c2);
	System.out.println("Multiplication is "+c5.real+"+"+c5.imag+"i");
}
}

class Complex
{
	
	int real,imag;
	Complex()
	{
		real=0;
		imag=0;
	}
	Complex(int r,int i)
	{
		real=r;
		imag=i;
	}
	
	Complex add(Complex c1,Complex c2)
	{
		Complex c3= new Complex();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		return(c3);		
	}

	Complex sub(Complex c1,Complex c2)
	{
		Complex c4= new Complex();
		c4.real=c1.real-c2.real;
		c4.imag=c1.imag-c2.imag;
		return(c4);		
	}
	Complex mul(Complex c1,Complex c2)
	{
		Complex c5= new Complex();
		c5.real=(c1.real*c2.real)-(c1.imag*c2.imag);
		c5.imag=(c1.real*c2.imag)+(c1.imag*c2.real);
		return(c5);
	}
}