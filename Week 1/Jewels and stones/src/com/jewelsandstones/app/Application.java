package com.jewelsandstones.app;

public class Application {
	public static final int Max_Length = 50;

	public static void main(String[] args) {
		String format = "There are %d jewels";

		System.out.println(String.format(format, countJewels("aA", "aAAbbbb")));
		System.out.println(String.format(format, countJewels("z", "ZZ")));
	}

	public static int countJewels(String jewels, String stones) {
		char currentChar;
		int countJewels = 0;

		if (jewels.length() <= Max_Length && stones.length() <= Max_Length) {
			for (int i = 0; i < stones.length(); i++) {
				currentChar = stones.charAt(i);
				
				if (jewels.contains(String.valueOf(currentChar))) {
					countJewels++;
				}
			}
		}

		return countJewels;
	}

}
