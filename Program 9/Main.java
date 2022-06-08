//(9)Write a java program which will accept 5 city names from the user and sort them using compareTo() method.

import javax.swing.*;

class Main {
	public static void main(String args[]) {
		int i;
		String city[] = new String[5];

		for (i = 0; i < 5; i++)
			city[i] = JOptionPane.showInputDialog(null, "Enter the Name of the city for " + i + " ");

		for (i = 0; i < 5; i++)
			System.out.println("The City Name is : " + city[i]);

		System.out.println("\n");

		for (i = 0; i < 5; i++)
			for (int j = 0; j < i; j++)
				if (city[i].compareTo(city[j]) < 0) {
					//if
					String temp = city[i];
					city[i] = city[j];
					city[j] = temp;
				}

		System.out.println("\n");
		for (i = 0; i < 5; i++) {
			System.out.println("The City Name is : " + city[i]);
		}
	}
}
