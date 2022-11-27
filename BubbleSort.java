package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {
	static Scanner scanner = new Scanner(System.in);

	static public void bubbleSort(Integer[] array) {
		{
			int size = array.length;

			for (int j = 0; j < size - 1; j++) 
				for (int k = 0; k < size - 1 - j; k++) 

					if (array[k]>array[k + 1]) { 

						Integer temp = array[k];
						array[k] = array[k + 1];
						array[k + 1] = temp;
					}
		}
	}
	static public void printArray(Integer[] integers) {
		for (int i = 0; i < integers.length; i++) { 
			System.out.println("Integer at index " + i + " is " + integers[i]);
		}
	}

	static public void scanArray(Integer[] integers) {
		for (int i = 0; i < integers.length; i++) { 
			System.out.printf("Enter the integer at index :%d\n", i);
			integers[i] = scanner.nextInt();
		}
	}

	public static void main(String[] args) {
		Integer[] integers = new Integer[5];
		scanArray(integers);
		System.out.println("***********************Before Sort*************************");
		printArray(integers);
		bubbleSort(integers);
		System.out.println("***********************After Sort*************************");
		printArray(integers);

	}

}
