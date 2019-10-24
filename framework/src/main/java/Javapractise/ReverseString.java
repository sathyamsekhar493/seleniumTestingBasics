package Javapractise;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		String rev1 = "";

		Scanner sn = new Scanner(System.in);

		System.out.println("enter the string:");
		str = sn.next();

		int str1 = str.length();

		for (int i = str1 - 1; i >= 0; i--) {
			rev1 = rev1 + str.charAt(i);

		}
		System.out.println(rev1);

	}

	@Test
	public void getmethod() {
		StringBuffer str = new StringBuffer("mounikanil");
		System.out.println(str.reverse());
		

	}
	

}
