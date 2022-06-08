import javax.swing.*;

class InputDem02
{
	public static void main(String args[])
	{
		String str1,str2;
		int num1,num2;
		str1=JOptionPane.showInputDialog(null,"Enter the number 1 : ","Number Information",JOptionPane.QUESTION_MESSAGE);
		str2=JOptionPane.showInputDialog(null,"Enter the number 2 : ","Number Information",JOptionPane.QUESTION_MESSAGE);
		num1=Integer.parseInt(str1);
		num2=Integer.parseInt(str2);

		double add,sub,mul,div,mod;
		add=num1+num2;
		mul=num1*num2;
		div=num1/num2;
		sub=num1-num2;
		mod=num1%num2;
		
		JOptionPane.showMessageDialog(null,"Sum is: "+add+"\nSubtraction is: "+sub+"\nMultiplication is : "+mul+"\nDivision is : "+div+"\nMode is : "+mod);
	}
}