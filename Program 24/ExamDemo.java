/**
Write an interface called Exam with a method Pass(int mark) that returns a
Boolean. Write another interface called Classify with a method Division(int
average) which returns a string. Write a class called Result which implements
both Exam and Classify. The pass method should return true if the marks is
greater than or equal to 35 else false. The division method must return �First�
when the parameter average is 60 or more, �second� when average is 50 or
more but below 60, �no division� when average is less than 50.
*/


import javax.swing.*;
public 	class ExamDemo
{
	public static void main(String a[])
	{
		int mark=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks : "));

		Result robj=new Result();
		boolean m;
		m=robj.pass(mark);
		
		if(m==true)
			System.out.println("You are passed and grade is");
		else
			System.out.println("You are Failed and grade is");
		System.out.print(""+robj.division(mark));
	}
}

interface Exam
{
	public boolean pass(int marks);
}

interface Classify
{
	public String division(int avg);
}

class Result implements Exam, Classify
{
	public boolean pass(int marks)
	{
		boolean m=true;
		if(marks>=35)
			m=true;
		else
			m=false;

		return m;
	}
	public String division(int avg)
	{
		String str="hello";

		if(avg>60)
			str="First";

		else if(avg>50 && avg<60)
			str="Second";

		else if(avg<50)
			str="No division";

		return (str);
	}
}
