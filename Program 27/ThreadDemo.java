/*
Create two threads, one thread should print odd numbers between x to y (inclusive) and second should print even numbers between them. 
Values of x and y should be user given. 
Main thread should wait for thread to be finished and afterwards it should print the message “Thanks for using program!”. 
Create threads with the help of Thread class.
*/

import javax.swing.*;
class ThreadDemo
{
	public static void main(String a[])
	{
		int a1,b1;

		a1=Integer.parseInt(JOptionPane.showInputDialog("Enter No. 1 "));
		b1=Integer.parseInt(JOptionPane.showInputDialog("Enter No. 2 "));

		Thread1 t1=new Thread1(a1,b1);
		Thread2 t2=new Thread2(a1,b1);
		try
		{
		t1.join();
		t2.join();
		}
		catch(Exception e)
		{}
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread
{
	int x,y;
	Thread1(int a,int b)
	{
		x=a;
		y=b;
	}
	public void run()
	{
		int i=0;
		for(i=x;i<=y;i++)
			if(i%2==0)
				System.out.println(i+" ");
		System.out.println();
	}
}
class Thread2 extends Thread
{
	int x,y;
	Thread2(int a,int b)
	{
		x=a;
		y=b;
	}
	public void run()
	{
		int i=0;
		for(i=x;i<=y;i++)
			if(i%2!=0)
				System.out.println(i+" ");
		System.out.println();
	}

}
