import javax.swing.JOptionPane;

public class Interest
{
	public static void main(String args[])
	{
		double principal=20000,rate=10,intrest;
		int time=2;

		intrest=rate*time*principal/100;
		double total=principal+intrest;

		System.out.println("\n\t\t\tPrincipal is "+principal);
		System.out.println("\t\t\tRate is "+rate);
		System.out.println("\t\t\tTime is "+time);
		System.out.println("\t\t\tIntrest is "+intrest);

		JOptionPane.showMessageDialog(null,"\t\t\tTotal Amount is "+total);
	}
}
