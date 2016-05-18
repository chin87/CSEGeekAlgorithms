package com.csegeek.algo.arraystrings;

import java.util.Arrays;

/**
 * @author chinmaydeshpande
 *
 */
public class ArrayStrings {

	public ArrayStrings(){
		
	}

	/**
	 *  Arrays & Strings
		Problem :- 
		Reverse an array in-place i.e you cannot use any additional array or in other words, 
		space complexity of the solution should be O(1)
		Solution :- 
		1) Use two variables (a,b) initialized with the first (0) and last index (n-1) respectively of the array of 'n' elements.
		2) Swap the values at arr(a) and arr(b).
		3) Increment a and decrement b. 
		4) Repeat step 2 till a and b intersects.
	 * @param array
	 */
	public void reverseArray(int[] array) {
		System.out.println("original:-" + Arrays.toString(array));
		int start = 0;
		int end = array.length - 1;
		while (start < end) {
			array = swap(array, start, end);
			start++;
			end--;
		}
		System.out.println("reversed:-" + Arrays.toString(array));
	}
	
	private int[] swap(int[] array, int start, int end ){
		int temp = array[start];
		array[start] = array[end];
		array[end] = temp;
		return array;
	}
	
	/**
	 * Problem :- Sort an array of 0s & 1s, i.e element at each index of the array is either 0 or 1. Implement an efficient algorithm so that the array gets sorted (all '0's are placed before '1's)
		
		Solution :- 
		First approach that we might think of is counting the no. of '0's (say 'm') and '1s' (say 'n') and then placing m '0's and n '1's. Well, this approach is efficient with complexity of O(n) but it requires traversing the array 2 times. So, as soon as you suggest this approach, interviewer would ask for a better solution.
		Following implementation sorts the array in 1 pass.
		Say 'i' points to index 0 & 'j' points to index n-1.
		We will start traversing from end of the array.
		If arr(j) is 0, then swap arr(i) & arr(j) and increment 'i' else decrement 'j'.
		In this way all 0s will form one portion of the array and all 1s will form other portion.
	 */
	public void sort01(int[] array) {
		int i = 0;
		int j = array.length - 1;
		System.out.println("original:-" + Arrays.toString(array));
		while (i < j) {
			if (array[j] == 0) {
				// i.e. 0 and 1
				array = swap(array, i, j);
				i++;
			} else {
				j--;
			}
		}
		System.out.println("reversed:-" + Arrays.toString(array));
	}
	
	/**
	 * Problem :- 
		Sort an array of 0s, 1s & 2s, i.e element at each index of the array is either 0, 1 or 2 and we need to place all 0s first, then 1s and finally all 2s. 
		
		Solution :- 
		After implementing an efficient algorithm to sort an array of 0s & 1s, 
		a very common follow up question is to sort the array of 0s, 1s & 2s.
		Again, we won't consider the counting approach rather would go for a 1 pass 
		approach in which the sorting would be done by traversing the array only once.
		We need to divide the array into 3 parts.
		Say 'i' points to index 0 & 'j' points to index n-1.
		We will start traversing from the end of array & 'k' is the iterator starting at index n-1.
		If arr(k) is 0, then swap arr(i) & arr(k) and increment 'i'.
		If arr(k) is 2, then swap arr(j) & arr(k) and decrement 'j'.
		If arr(k) is 1, then don't do anything, simple decrement the iterator 'k'.
		In this way, the array will be divided into 3 portions.
	 */
	public void sort012( int[] array ){
		int i = 0;
		int j = array.length - 1;
		int k = j;
		System.out.println("original:-" + Arrays.toString(array));
		while (k >= i) {
			if (array[k] == 0) {
				array = swap(array, i, k);
				i++;
			} else if (array[k] == 2) {
				array = swap(array, k, j);
				j--;
			} else {
				k--;
			}
		}
		System.out.println("sorted:-" + Arrays.toString(array));
	}
}
