//Practice assignment
//@author Young Nguyen
//Program will sort strings in alphabetical order and print
public class Sort {

	//main method; call the sort method and print the sorted array using print method
	public static void main(String[] words) {
		//sort the array
		sort(words, 0, words.length-1);
		//print sorted string array
		System.out.println("Sorted string array:");
		print(words);
	}
	
	//actual sort method; sort array elements starting from Lth element to Uth element; all other elements 
	//remain unchanged
	//selection sort method implemented; pick smallest element, place it at head of array, then //recursively sort the subarray that does not include the afore-mentioned smallest element
	static void sort (String[] A, int L, int U) {
		//for one element array, or illegal condition where lower bound is greater than upper bound, then 
		//do nothing
		if (L >= U) {
			return;
		} else {
			//swap element L & smallest element
			int temp = smallest(A, L, U);
			String tempString = A[L];
			A[L] = A[temp];
			A[temp] = tempString;
			sort (A, L+1, U);
		}
	}
	
	//return the index of smallest item in A from L to U
	private static int smallest(String[] A, int L, int U) {
		//array has only 1 element
		if (L == U) {
			return L;
		};
		//recursively call the method, store index of smallest element found in the subarray as k
		int k = smallest(A, L+1, U);
		//compare element k with element L; if L is smaller, return L; if k is smaller, return k
		if (A[L].compareTo(A[k]) < 0) {
			return L;
		} else {
			return k;
		}
	}
	
	//print string array A on one line, separated by blanks
	static void print (String[] A) {
		for (int i=0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
