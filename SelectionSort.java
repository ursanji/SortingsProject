package com.veeranjaneyulu;

public class SelectionSort {

	private static void selectionSort(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {64, 25, 12, 22, 11, 32, 5, 90, 45, 11};
		
		selectionSort(array);
		
		for(int a: array) {
			System.out.print(a + " ");
		}
	}

}
