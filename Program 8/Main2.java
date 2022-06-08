//(8) Write a java program which will check whether the string is palindrom or not without using reverse(). String has to be accepted from the user.

import javax.swing.*;

class Main2 {
	public static void main(String a[]) {
		String str, temp = "";
		str = JOptionPane.showInputDialog(null, "Enter the Statement: ", "Enter the Statement",
				JOptionPane.QUESTION_MESSAGE);
		// StringBuffer sb = new StringBuffer(str);
		// StringBuffer sb2 = new StringBuffer();

		int len = str.length();
		// String temp = "";
		for (int i = len - 1; i >= 0; i--) {
			// char let=sb.charAt(i);
			// temp=Character.toString(let);
			// sb2.append(temp);
			// sb2+=Character.toString(let);
			temp = temp + str.charAt(i);
		}
		// temp = sb2.substring(0);
		if (temp.equals(str)) {
			System.out.println("The string is Palindrome");
		} else {
			System.out.println("The string is not Palindrome");
		}
	}
}