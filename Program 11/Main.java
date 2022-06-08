// 11. Write a program to find sum and multiplication of two matrices of 3 x3.

import javax.swing.*;

class Main
{
	public static void main(String a[])
	{
		int i,j;
		int mat1[][]= new int[3][3];
		int mat2[][]= new int[3][3];
		int mat3[][]=new int[3][3];
		int mat4[][]=new int[3][3];

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat1[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Number for first Matrix ["+i+"]["+j+"]"));
			}
		}


		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat2[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Number for Second matrix ["+i+"]["+j+"]"));
			}
		}

		System.out.println("Matrix 1 details\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t "+mat1[i][j]);
			}
			System.out.println("\n");
		}


		System.out.println("\n");

		System.out.println("Matrix 2 details\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t "+mat2[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("\n");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}

		System.out.println("\n");

		System.out.println("Matrix after Addition\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t "+mat3[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
		
					mat4[i][j]=mat4[i][j]+(mat1[i][k]*mat2[k][j]);
				}
			}
		}
		System.out.println("\n");

		System.out.println("Matrix after Multipication\n");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t "+mat4[i][j]);
			}
			System.out.println("\n");
		}
	}
}