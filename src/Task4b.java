import java.util.Scanner;

public class Task4b {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans = 0;

		// ---------------write your code BELOW this line only!--------------
		int n = scanner.nextInt();
		for (int x = 2; x <= n; x = x + 1) {                // This loop means we are checking every x , in the range of x>2 and x<=n
			boolean IsPrime = true;                         // We take the previous code (4a) and we create another loop that checks if the
									                        // number is a Prime number.
			for (int i = 2; i * i <= x; i = i + 1) {        // The second loop inside the first one means we check every number
													       	// from the First loop and put it in the second loop.
				if (x % i == 0) {                           // When the loop determines the number is prime We take the variable ans as a
									                        // counter and increase it by 1 , therefore we end up with the Number of primes
									                        // up to x=n
					IsPrime = false; //
				} //
			}
			if (IsPrime)
				ans = ans + 1;
		}
		// ---------------write your code ABOVE this line only!--------------

		System.out.println(ans);
		scanner.close();
	}
}