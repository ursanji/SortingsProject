package com.veeranjaneyulu;

public class InsertionSort {

	private static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int temp = array[i];

			for (int j = i - 1; j >= 0; j--) {

				if (temp < array[j]) {

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
		
		// call the sorting method
		insertionSort(array);

		System.out.println("Array After Sorting: ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
