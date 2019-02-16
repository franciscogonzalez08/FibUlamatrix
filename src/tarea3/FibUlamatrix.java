package tarea3;

import javax.swing.JOptionPane;

public class FibUlamatrix {
	private static String strulam = "";
	private static int fibulamatrix[][];
	public static void main(String[] args) {
		// Hello World question mark
		int n = Integer.parseInt(JOptionPane.showInputDialog("Dame n:"));
		ulam(n);
		String arrUlam[] = strulam.split(" ");
		int rows = arrUlam.length;
		fibulamatrix = new int[rows][];
		int numUlam;
		for(int i = 0; i <rows; i++) {
			numUlam = Integer.parseInt(arrUlam[i]);
			if(numUlam > 20)
				numUlam = 20;
			fibulamatrix[i] = new int[numUlam];
			fibonacci(numUlam, i);
		}
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
			if(numUlam != Integer.parseInt(arrUlam[i]))
				strFibulamatrix += " ...";
			strFibulamatrix += "\n";
		}
		System.out.print(strFibulamatrix);
	}
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
	public static void fibonacci(int ulam, int row) {
		if(ulam == 1)
			fibulamatrix[row][0] = row;
		else {
			int fib1 = row;
			int fib2 = row + 1;
			//System.out.printf("%d ", fib1);
			fibulamatrix[row][0] = fib1; 
			ulam--;
			//System.out.printf("%d ", fib2);
			fibulamatrix[row][1] = fib2;
			ulam--;
			int temp;
			for(int i = 0; i < ulam; i++) {
				temp = fib1 + fib2;
				//System.out.printf("%d ", temp);
				fibulamatrix[row][i + 2] = temp;
				fib1 = fib2;
				fib2 = temp;
			}
		}
	}
}
