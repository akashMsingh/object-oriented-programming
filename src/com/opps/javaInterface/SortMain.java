package com.opps.javaInterface;

public class SortMain {
	public static void main(String[] args) {
		int[] arr= {83,37,2,3,6,7,};
		System.out.println("=============Bubble Sort==========");
		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.sort(arr);
		printArray(arr);
		System.out.println("=============Selection Sort============");
		SelectionSort selectionSort=new SelectionSort();
		selectionSort.sort(arr);
		printArray(arr);
		
	}
	private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
