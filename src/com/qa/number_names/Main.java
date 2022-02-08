package com.qa.number_names;

import java.util.Arrays;

public class Main {

	// print function
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	
	
	public static void main(String[] args) {
		
		printMessage("What is your number?");
		int number = UserInput.input();

		int[] temp = Calculations.reverseArray(number);
		
		
		if (temp.length <= 9) {
			String result = Calculations.whichReadout(temp);
			printMessage("" + result);
		}
	}

}
