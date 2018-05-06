package com.veeranjaneyulu;

public class MergeSort {
	
	public static void mergeSort(int[] array, int leftStart, int rightEnd) {
		mergeSort(array, new int[array.length], leftStart, rightEnd);
	}

	public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
		
		if(leftStart >= rightEnd) {
			return;
		}
		
		int middle = (leftStart + rightEnd) / 2;
		
		// apply merge sort recursively on two halves
		mergeSort(array, temp, leftStart, middle);
		mergeSort(array, temp, middle + 1, rightEnd);
		
		// merge the two halves
		mergeHalves(array, temp, leftStart, rightEnd);
		
	}
	
	
	private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
		
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left <= leftEnd && right <= rightEnd) {
			if(array[left] <= array[right]) {
				temp[index] = array[left];
				left++;
			}
			else {
				temp[index] = array[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(array, left, temp, index, leftEnd - left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
		
	}


	public static void main(String[] args) {
		
		int[] array = {1, 4, 3, 18, 21, 4, 9, 6, 45, 92, 31, 90, 54, 73, 2, 7, 0};
		int size = array.length -1;
		System.out.println("Array Before Sorting: ");
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println();

		
		mergeSort(array, 0, size);
		
		System.out.println("Array After Sorting: ");
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
