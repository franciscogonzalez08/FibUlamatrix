package tarea3;

import javax.swing.JOptionPane;

public class FibUlamatrix {
	private static String strulam = ""; // temporarily stores Ulam series
	private static int fibulamatrix[][];
	
	public static void main(String[] args) {
		// Read user input
		int n = Integer.parseInt(JOptionPane.showInputDialog("Dame n:"));
		// Figure out Ulam series' members and length
		ulam(n);
		String arrUlam[] = strulam.split(" ");
		int rows = arrUlam.length;
		fibulamatrix = new int[rows][];
		
		// We'll reserve space for the pseudo-fibonaccis and store them
		int numUlam;
		for(int i = 0; i < rows; i++) {
			numUlam = Integer.parseInt(arrUlam[i]);
			if(numUlam > 20) numUlam = 20; // we're asked not to calculate over 20 tho so yeah
			fibulamatrix[i] = new int[numUlam];
			fibonacci(numUlam, i); // this calculates the fibos and stores them in the fibulamatrix
		}
		
		// We'll store our desired output in a string because it's pedagogic or something
		int i, j;
		String strFibulamatrix = "Fibulamatrix con N = " + n + ":\n";
		for(i = 0; i < rows; i++) {
			numUlam = Integer.parseInt(arrUlam[i]);
			if(numUlam < 10)
				strFibulamatrix += "[ ";
			else
				strFibulamatrix += "[";
			strFibulamatrix += numUlam + "] ";
			if(numUlam > 20)
				numUlam = 20;
			
			for(j = 0; j < numUlam - 1; j++) {
				strFibulamatrix += fibulamatrix[i][j] + " ";
			}
			strFibulamatrix += fibulamatrix[i][j];
			
			// We'll see if we truncated the fibos because we had more than 20
			if(numUlam != Integer.parseInt(arrUlam[i]))
				strFibulamatrix += " ...";
			
			strFibulamatrix += "\n";
		}
		
		// And we can finally print this to the console #yay
		System.out.print(strFibulamatrix);
	}
	
	// Generates Ulam series and stores them in strulam
	public static void ulam(int n) {
		strulam += n;
		while(n != 1) {
			if(n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;
			strulam = strulam + " " + n;
			} 
	}
	
	// Generates ulam pseudo-fibos; having row and row+1 as our first 2 fibos
	public static void fibonacci(int ulam, int row) {
		if(ulam == 1)
			fibulamatrix[row][0] = row;
		else {
			int fib1 = row;
			int fib2 = row + 1;
			fibulamatrix[row][0] = fib1; 
			ulam--;
			fibulamatrix[row][1] = fib2;
			ulam--;
			
			int temp;
			for(int i = 0; i < ulam; i++) {
				temp = fib1 + fib2;
				fibulamatrix[row][i + 2] = temp;
				fib1 = fib2;
				fib2 = temp;
			}
		}
	}
}