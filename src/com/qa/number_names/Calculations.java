package com.qa.number_names;

import java.util.Arrays;

public class Calculations {

	public Calculations(int num1) {
	};

	public static int[] reverseArray(int num1) {

		String length = String.valueOf(num1);

		int[] numberArray = new int[length.length()];

		for (int i = 0; i < length.length(); i++) {

			numberArray[(length.length() - 1) - i] = length.charAt(i) - '0';
		}
		return numberArray;
	}

// -----------------------------------------------------------------------------------------------

	public static String threeDigits(int[] num1) {

		int length = num1.length;

		String unit = "";
		if (num1[0] == 0 && length > 1) {
			unit = "";
		} else {
			unit = Readout.readUnit(num1[0]);
		}

		String ten = "";
		if (length > 1) {
			if (num1[1] == 1) {
				unit = "";
				ten = Readout.readTeens(num1[0]);
			} else {
				ten = Readout.readTen(num1[1]);
			}
		}

		String hundred = "";
		String hundredAnd = "and ";
		String notEmpty = " hundred ";
		if (length > 2) {
			hundred = Readout.readUnit(num1[2]);
			if (num1[1] == 0) {
				ten = "";
				if (num1[0] == 0) {
					hundredAnd = "";
				}
			}
			if (num1[2] == 0) {
				hundred = "";
				notEmpty = "";
			}
		}

		String result = "";
		switch (length) {
		case 1:
			result = unit;
			break;
		case 2:
			result = (ten + " " + unit);
			break;
		case 3:
			result = (hundred + notEmpty + hundredAnd + ten + " " + unit);
			break;
		default:
			break;
		}
		return result;
	}

// ---------------------------------------------------------------------------------------------------
	
	public static String whichReadout(int[] num1) {
		
		int length = num1.length;
		
		String hundred = ""; 
		String thousand = ""; 
		String million = "";
		
		int[] part1 = Arrays.copyOfRange(num1, 0, Math.min(num1.length,3));
		hundred = threeDigits(part1);
		if (length > 3) {
			int[] part2 = Arrays.copyOfRange(num1, 3, Math.min(num1.length,6));
			thousand = threeDigits(part2);
		}
		if (length > 6) {
			int[] part3 = Arrays.copyOfRange(num1, 6, Math.min(num1.length,9));
			million = threeDigits(part3);
		}

		 int increment = ((length-1) / 3) + 1;
		 
		 String result = ""; 
		 String spacer1 = " million, ";
		 String spacer2 = " thousand, ";
		 switch(increment) {
		 	case 1: 
		 		hundred = threeDigits(part1); 
		 		result = hundred;
		 		break; 
		 	case 2: 
		 		result = (thousand + spacer2 + hundred); 
		 		break; 
		 	case 3: 
		 		if (thousand.equals(" ")) {
		 			spacer2 = "";
		 		}
		 		result = (million + spacer1 + thousand + spacer2 + hundred); 
		 		break; 
		 	default:
		 		break; 
		 }
		
		return result;
		
	}

}
