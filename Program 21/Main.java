/*The abstract Vegetable class has four subclasses named cabbage, carrot and
potato. Write an application that demonstrates how to establish this class
hierarchy. Declare one instance variable of type string that indicates the color of
a vegetable. Create and display instances of these object. Override the toString()
method of object to return a string with the name of the vegetable and its color.
*/

abstract class Vegetable
{
	abstract public String toStrings();
}

class Cabbage extends Vegetable
{
	String color;
	Cabbage(String vegcolor)
	{
		color=vegcolor;
	}
	public String toStrings()
	{
		return(color);
	}
}

class Carrot extends Vegetable
{
	String color;
	Carrot(String vegcolor)
	{
		color=vegcolor;
	}
	public String toStrings()
	{
		return(color);
	}
}


class Potato extends Vegetable
{
	String color;
	Potato(String vegcolor)
	{
		color=vegcolor;
	}
	public String toStrings()
	{
		return(color);
	}
}

class Main
{
	public static void main(String a[])
	{
		Carrot c1=new Carrot("Red");
		System.out.println("The Color of Carrot is : "+c1.toStrings());

		Cabbage c2=new Cabbage("Green");
		System.out.println("The Color of Cabbage is : "+c2.toStrings());

		Potato p1=new Potato("Brown");
		System.out.println("The Color of Potato is : "+p1.toStrings());
	}
}
