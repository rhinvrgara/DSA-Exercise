import java.io.IOException;
import java.util.Scanner;

class FibonacciSeries {
	public static void main(String args[]) throws IOException {
		
		System.out.print("Enter the length of the Series: ");
		Scanner in = new Scanner(System.in);
		int seriesLength = in.nextInt();
		in.close();
		
		long x = 0, y = 1;
		for (int i = 0; i < seriesLength; i++) {
			System.out.print(x + " ");
			long t = y;
			y =  x + y;
			x = t;
		}
		System.out.println();		
		System.out.print("Rhina Vergara ACT2");
		System.out.println();
		System.out.println("Thanks for Using my Program :)");
	}
}
