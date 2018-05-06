package com.veeranjaneyulu;

public class BubbleSort {

	private static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 64, 25, 12, 22, 11, 32, 5, 90, 45, 11 };

		System.out.println("Array Before sorting: ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		bubbleSort(array);

		System.out.println("Array After Sorting: ");
		for (int a : array) {
			System.out.print(a + " ");
		}

	}

}
