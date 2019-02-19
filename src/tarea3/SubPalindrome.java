package tarea3;

import java.util.Arrays;

public class SubPalindrome {

	public static void main(String[] args) {
		// This has been here since the big bang
		int[] arreglo1 = {0, 1, 1, 2, 3, 5, 7};
		int[] arreglo2 = {1, 2, 3, 5, 0, 1, 2, 3};
		int k = 5;
		
		// Get sub-arrays with k members
		int[] subArr1 = Arrays.copyOfRange(arreglo1, 0, k);
		int[] subArr2 = Arrays.copyOfRange(arreglo2, 0, k);
		
		// Order them
		Arrays.sort(subArr1);
		Arrays.sort(subArr2);
		
		//Printing our arrays in the console
		System.out.println("Arreglo 1:");
		
		for(int i = 0; i < arreglo1.length; i++)
			System.out.printf("%d ", arreglo1[i]);
		System.out.println();
		
		System.out.println("Arreglo 2:");
	
		for(int i = 0; i < arreglo2.length; i++)
			System.out.printf("%d ", arreglo2[i]);
		System.out.println();

		//Value for k
		System.out.printf("K = " + k);
		System.out.println();
		
		// Are they EQUAL? o v o
		System.out.println(Arrays.equals(subArr1, subArr2));
	}

}


//Para los arreglos: 
//
//
//con k = 
