abstract class Fish
{
	abstract void display();
}

abstract class FreshWaterFish extends Fish
{
	abstract void display();
}

abstract class SaltWaterFish extends Fish
{
	abstract void display();
}

class Trout extends FreshWaterFish
{
	void display()
	{
		System.out.println("Fish Trout");
	}
}

class Flounder extends SaltWaterFish
{
	void display()
	{
		System.out.println("Fish Flounder");
	}
}

class Tuna extends SaltWaterFish
{
	void display()
	{
		System.out.println("Fish Tuna");
	}
}



class AbstractFish
{
	public static void main(String a[])
	{
		Fish arr[]=new Fish[3];

		arr[0]=new Trout();
		arr[1]=new Flounder();
		arr[2]=new Tuna();

		for(int i=0;i<3;i++)
		{
			if(arr[i] instanceof SaltWaterFish)
				arr[i].display();
		}

	}
}