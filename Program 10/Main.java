// (10). Write a program to sort a list of students on the basis of the marks.

import javax.swing.*;
class Main
{
	public static void main(String a[])
	{
		int i,roll,mark;
		final int SIZE=5;
		Student s[]= new Student[SIZE];
		for(i=0;i<SIZE;i++)
		{
			roll=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the roll no. for student "+(i+1)+" "));
			mark=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Marks for student "+(i+1)+" "));
			s[i]=new Student(roll,mark);
		}
		Student temp=new Student();
		System.out.println("Before Sorting");
		System.out.println("===============================================");
		System.out.println("Roll No. and Marks are");
		System.out.println("===============================================");
		for(i=0;i<SIZE;i++)
		{
			s[i].display();
		}
		System.out.println("===============================================");
		temp.sort(s);


		System.out.println("After Sorting\n");
		System.out.println("===============================================");
		System.out.println("Roll No. and Marks are");
		System.out.println("===============================================");
		for(i=0;i<SIZE;i++)
		{
			s[i].display();
		}
		System.out.println("===============================================");
	}
}

class Student
{
	int rollno,marks;
	Student(int roll, int mark)
	{
		rollno=roll;
		marks=mark;
	}
	Student()
	{
		rollno=marks=0;
	}
	void sort(Student st[])
	{
		int i,j;
		Student temp= new Student();
		for(i=0;i<st.length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(st[i].marks < st[j].marks)
				{
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}	
		}
	}
	void display()
	{
		System.out.println(this.rollno+"\t"+this.marks);
	}
}