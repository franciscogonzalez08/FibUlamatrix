package tarea3;

import java.util.Arrays;

public class SubPalindrome {

	public static void main(String[] args) {
		// This has been here since the big bang
		int[] arreglo1 = {5, 12, 8, 1,  6, 17};
		int[] arreglo2 = {1, 8, 5, 6, 12,  3};
		int k = 5;
		
		// Get sub-arrays with k members
		int[] subArr1 = Arrays.copyOfRange(arreglo1, 0, k);
		int[] subArr2 = Arrays.copyOfRange(arreglo2, 0, k);
		
		// Order them
		Arrays.sort(subArr1);
		Arrays.sort(subArr2);
		
		// Are they EQUAL? o v o
		System.out.println(Arrays.equals(subArr1, subArr2));
	}

}
