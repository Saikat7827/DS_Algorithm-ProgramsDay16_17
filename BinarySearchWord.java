package com.bridgelabz;

import java.util.Arrays;

public class BinarySearchWord {
	
	public static void main(String[] args) {
		String[] arrayElements = { "Saikat", "Trigger", "Babai", "Subham", "Sonu", "Tinki" };
		Arrays.sort(arrayElements);
		System.out.println(Arrays.toString(arrayElements));
		String search = "Saikat";
		int result = binarySearch(arrayElements, search);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

	static int binarySearch(String[] arrayElements, String search) {
		int left = 0, right = arrayElements.length - 1;
		while (left <= right) {
			int member = left + (right - left) / 2;
			int result = search.compareTo(arrayElements[member]);
			if (result == 0)
				return member;
			if (result > 0)
				left = member + 1;
			else
				right = member - 1;
		}

		return -1;
	}
}
