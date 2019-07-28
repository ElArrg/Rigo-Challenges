package com.happynumbers.app;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		long number;
		String result;
		boolean keepTrying;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Ingresa un número para saber si es féliz :D (letras para terminar) >");
			keepTrying = input.hasNextLong();
			
			if(keepTrying) {
				number = input.nextLong();
				result = isHappyNumber(number) ? "féliz =D" : "inféliz UnU";
		
				System.out.println(String.format("El número %d es %s", number, result));
			}
		} while(keepTrying);
		
		input.close();
	}

	public static boolean isHappyNumber(long number) {
		long newNumber;
		Set<Long> seenNumbers;
		boolean isHappy = false;

		if (number > 0) { // Is positive & might be happy =).
			seenNumbers = new HashSet<Long>();

			while (number != 1) {
				newNumber = 0;

				if (seenNumbers.add(number)) {
					
					while (number != 0) {
						newNumber += squareOf(number % 10);
						number = number / 10;
					}

					number = newNumber;
				} else {
					break;
				}
			}

			isHappy = (number == 1);
		}

		return isHappy;
	}
	
	public static Long squareOf(Long number) {
		return number * number;
	}

}
