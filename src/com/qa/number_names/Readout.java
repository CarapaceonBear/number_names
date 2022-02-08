package com.qa.number_names;

public class Readout {

	public Readout(int num1) {};
	
	public static String readUnit(int num1) {
		String result = "empty"; 
		switch(num1) {
			case 0:
				result = "zero";
				break;
			case 1:
				result = "one";
				break;
			case 2:
				result = "two";
				break;
			case 3:
				result = "three";
				break;
			case 4:
				result = "four";
				break;
			case 5:
				result = "five";
				break;
			case 6:
				result = "six";
				break;
			case 7:
				result = "seven";
				break;
			case 8:
				result = "eight";
				break;
			case 9:
				result = "nine";
				break;
		}
		return result;
	}
	
	public static String readTeens(int num1) {
		String result = "empty"; 
		switch(num1) {
			case 0:
				result = "ten";
				break;
			case 1:
				result = "eleven";
				break;
			case 2:
				result = "twelve";
				break;
			case 3:
				result = "thirteen";
				break;
			case 4:
				result = "fourteen";
				break;
			case 5:
				result = "fifteen";
				break;
			case 6:
				result = "sixteen";
				break;
			case 7:
				result = "seventeen";
				break;
			case 8:
				result = "eighteen";
				break;
			case 9:
				result = "nineteen";
				break;
		}
		return result;
	}
	
	public static String readTen(int num1) {
		String result = "empty"; 
		switch(num1) {
			case 0:
				result = "zero";
				break;
			case 1:
				result = "ten";
				break;
			case 2:
				result = "twenty";
				break;
			case 3:
				result = "thirty";
				break;
			case 4:
				result = "forty";
				break;
			case 5:
				result = "fifty";
				break;
			case 6:
				result = "sixty";
				break;
			case 7:
				result = "seventy";
				break;
			case 8:
				result = "eighty";
				break;
			case 9:
				result = "ninety";
				break;
		}
		return result;
	}
	
	
}
