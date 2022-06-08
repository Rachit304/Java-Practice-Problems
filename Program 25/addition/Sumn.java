/*
Write a java class called Sumn that finds the sum of all numbers from 1 upto a given number n. 
This class is contained in the sub directory named Addition , under the current directory where all other java program files are stored. 
Write a package statement inside the class Sumn and imports it in another file and display the summation of numbers.
*/

package addition;

public class Sumn
{
	public int add(int n)
	{
		int i=0,sum=0;
		for(i=0;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}	
}