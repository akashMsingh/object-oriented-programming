package com.opps.javaInterface;

/*Write a Java program to create an interface Sortable with a method sort() that sorts an array 
 * of integers in ascending order. Create two classes BubbleSort and SelectionSort that implement 
 * the Sortable interface and provide their own implementations of the sort() method
 */
public interface Sortable {
	void sort(int[] arr);
}

class BubbleSort implements Sortable {

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}

class SelectionSort implements Sortable {

	@Override
	public void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}
	}
}
