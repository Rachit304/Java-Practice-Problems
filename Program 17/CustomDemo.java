import javax.swing.*;

class NegativeException extends Exception
{
	NegativeException(String msg)
	{
		super(msg);
	}
}
class CustomDemo
{
	public static void main(String args[])
	{
		try
		{
			int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number " ));
			if(num<0)
				throw new NegativeException("Number must be positive ");
			System.out.println("Number is : "+num);
		}
		catch(NegativeException ne)
		{
			System.out.println(ne.getMessage());
		}
	}
}