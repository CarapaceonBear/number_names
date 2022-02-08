package com.qa.number_names;

import java.util.Scanner;

public class UserInput {

	public static int input() {
		Scanner x = new Scanner(System.in);
		int number = x.nextInt();
		return number;
	}
}
