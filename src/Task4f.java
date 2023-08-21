import java.util.Scanner;

public class Task4f {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean ans = false;

		// ---------------write your code BELOW this line only!--------------
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		int d = scanner.nextInt();
		int k = scanner.nextInt();
		for (int t = 0; t < k & ans == true; t = t + 1) { // We repeat our instructions up to k times , and we make a stopping point
														  // when  we made sure that a number is not a prime (a number is declared prime if we checked 
			                                              // both of the conditions and at least one of them is not met).
			int b = (int) (Math.random() * (n - 2) + 2);  // Picking a random number in our requested domain
			int m = b;                                    // Applying our code from 4e to check if n is a prime or is not.
			b = 1;
			for (int i = 0; i < d; i = i + 1) {
				b = b * m % n;
			}
			if (b == 1)
				ans = true;
			for (int i = 0; i <= s - 1; i = i + 1) {
				int exp = 1;

				for (int j = 0; j < i; j = j + 1) {
					exp = 2 * exp;
				}
				b = 1;
				for (int j = 0; j < exp * d; j = j + 1) {
					b = b * m % n;
				}
				if (b == n - 1)
					ans = true;
			}
		}
		// ---------------write your code ABOVE this line only!--------------

		System.out.println(ans);
		scanner.close();
	}
}