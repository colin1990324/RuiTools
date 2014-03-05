package com.rui.tools.basic;

import java.util.Random;

/**
 * sort methods
 * 
 * @author ColinMac
 * 
 */
public class Sort {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// random array generator
		Random ran = new Random(10);
		int[] a = new int[100];
		for (int i = 0; i < 100; i++) {
			a[i] = ran.nextInt(100);
		}

		// test area
		quickSort(a, 0, 99);

		// show result
		for (int i = 0; i < 100; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// quick sort
	public static void quickSort(int[] a, int start, int end) throws Exception {
		if (end <= start)
			throw new Exception("input start must be smaller than end");
		int left = start;
		int right = end;
		int pivot = a[left + (right - left) / 2];

		// selection
		while (left <= right) {
			while (a[left] < pivot)
				left++;
			while (a[right] > pivot)
				right--;
			if (left <= right) {
				int tmp = a[left];
				a[left] = a[right];
				a[right] = tmp;
				left++;
				right--;
			}
		}
		// divide
		if (left < end)
			quickSort(a, left, end);
		if (right > start)
			quickSort(a, start, right);
	}
}
