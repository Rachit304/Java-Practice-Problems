/*	Write a java program to calculate gross salary of 3 employees using Employee class 
	(3)The employee list for a company contains employee code, name, designation and basic pay. 
*/

import javax.swing.*;
class Employee
{
	private int empId;
	private double basicSal,grossSal,hra,da;
	private String name,desig;
	Employee(int id,double b,String s,String d)
	{
		empId=id;
		basicSal=b;
		name=s;
		desig=d;
	}
	void calcGross()
	{
		hra=basicSal*0.1f;
		da=basicSal*0.45f;
		grossSal=basicSal+hra+da;
	}
	
	void display()
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println("Employee Name is : "+name);
		System.out.println("Employee ID is : "+empId);
		System.out.println("Employee Designation is : "+desig);
		System.out.println("Basic Salary is : "+basicSal);
		System.out.println("Gross Salary is : "+grossSal);
		System.out.println("--------------------------------------------------------------");
	}
}
class GrossSalC
{
	public static void main(String args[])
	{
		Employee emp1= new Employee(101,50000,"Visesh","Developer");
		emp1.calcGross();
		emp1.display();

		int empId3,empId2;
		double basicSal2,basicSal3;
		String name2,name3,desig2,desig3,str1,str2,str3,str4;

		Employee emp2= new Employee(102,60000,"Akarshi","Accountant");
		emp2.calcGross();
		emp2.display();

		str3=JOptionPane.showInputDialog(null,"Enter the Employee Id of 3rd employee : ","Enter EMP_Id",JOptionPane.QUESTION_MESSAGE);
		empId3=Integer.parseInt(str3);

		name3=JOptionPane.showInputDialog(null,"Enter the employee Name: ","Enter EMP_Name",JOptionPane.QUESTION_MESSAGE);
		desig3 =JOptionPane.showInputDialog(null,"Enter the Employee Designation : ","Enter EMP_Desig",JOptionPane.QUESTION_MESSAGE);

		str4=JOptionPane.showInputDialog(null,"Enter the Employee Basic Sal : ","Enter EMP_BasicSal",JOptionPane.QUESTION_MESSAGE);
		basicSal3=Double.parseDouble(str4);
		
		Employee emp3= new Employee(empId3,basicSal3,name3,desig3);
		emp3.calcGross();
		emp3.display();
	}
}