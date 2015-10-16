import java.util.*;

public class RecursiveFactorial
{
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n-1);
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = in.nextInt();

		System.out.print("Factorial of " + n + " is: ");
		System.out.println(factorial(n));
	}
}
