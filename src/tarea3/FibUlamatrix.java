package tarea3;

public class FibUlamatrix {
	public static void main(String[] args) {
		fibonacci(10, 0);
	}
	
	public static void fibonacci(int ulam, int row) {
		if(ulam == 1)
			System.out.println(row);
		else {
			int fib1 = row;
			int fib2 = row + 1;
			System.out.printf("%d ", fib1);
			ulam--;
			System.out.printf("%d ", fib2);
			ulam--;
			int temp;
			for(int i = 0; i < (ulam - 1); i++) {
				temp = fib1 + fib2;
				System.out.printf("%d ", temp);
				fib1 = fib2;
				fib2 = temp;
			}
			System.out.println(fib1 + fib2);
		}
	}
}
