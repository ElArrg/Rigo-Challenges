package com.pairelements.app;

public class Application {

	public static void main(String[] args) {
		int[] example1 = new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		int[] example2 = new int[] { 3, 3, 7, 7, 10, 11, 11 };
		int[] example3 = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 8 };
		int[] example4 = new int[] { 1, 2, 2, 3, 3, 4, 4, 8, 8 };

		System.out.println(String.format("El valor es: %d", getSingleElement(example1)));
		System.out.println(String.format("El valor es: %d", getSingleElement(example2)));
		System.out.println(String.format("El valor es: %d", getSingleElement(example3)));
		System.out.println(String.format("El valor es: %d", getSingleElement(example4)));
	}

	public static int getSingleElement(int[] elements) {
		int singleElement = -1;

		for (int i = 0; i < elements.length; i += 2) {
			if (i < elements.length - 1) {
				if (elements[i] != elements[i + 1]) {
					singleElement = elements[i];
					break;
				}
			} else {
				singleElement = elements[i];
			}
		}

		return singleElement;
	}

}
