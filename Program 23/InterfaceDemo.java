/*Write a program that demonstrates the instanceof operator.
Declare interfaces I1 and I2. Interface I3 extends both of these interfaces.
Also declares interface I4. Class X implements I3. 
Class W extends X and implements I4.
Create an object of class W. 
Use the instanceof operator to test if that object implements each of the interfaces and is of type X.
*/

interface I1
{
}
interface I2
{
}
interface I3 extends I1,I2
{
	//public void display();
}
interface I4
{
}

class X implements I3
{
	public void display()
	{
		System.out.println("In class X");
	}
}

class W extends X implements I4
{
	public void display()
	{
		System.out.println("In class W");
	}
}

class InterfaceDemo
{
	public static void main(String a[])
	{
		W wobj=new W();
		wobj.display();
		
		if(wobj instanceof X)
		{
			System.out.println("Wobj is the object of X");
		}
		if(wobj instanceof W)
			System.out.println("Wobj is not the object of X");

		if(wobj instanceof I1)
			System.out.println("Wobj is the object of I1");

		if(wobj instanceof I2)
			System.out.println("Wobj is the object of I2");

		if(wobj instanceof I3)
			System.out.println("Wobj is the object of I3");

		if(wobj instanceof I4)
			System.out.println("Wobj is the object of I4");
	}
}