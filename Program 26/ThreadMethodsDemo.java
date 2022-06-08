/*
Write an application that starts 3 threads. Each thread is instantiated from the same class and displays
a message. First thread should display the message “CORE JAVA EXAM” every 300 ms. Second
thread should display “SY BCA EXAM” every 500 ms. Third thread should display
“UNIVERSITY EXAM” every 400 ms. Create the threads using Thread class.
*/

class Thread1 extends Thread
{
	public void run()
	{	
		int i=0;
		for(i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println("Core Java");
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{	
		int i=0;
		for(i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println("SyBca");
		}
	}
}

class Thread3 extends Thread
{
	public void run()
	{	
		int i=0;
		for(i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		System.out.println("University Exam");
		}
	}
}

class ThreadMethodsDemo
{
	public static void main(String a[])
	{
		Thread ct=Thread.currentThread();
		System.out.println("Current Thread name : "+ct.getName());

		ct.setName("New Main Thread");

		System.out.println("Current Thread new name : "+ct.getName());
		System.out.println("Is Alive : "+ct.isAlive());

		Thread1 tx=new Thread1();
		Thread2 ty=new Thread2();
		Thread3 tz=new Thread3();

		tx.start();
		ty.start();
		tz.start();
	}
}