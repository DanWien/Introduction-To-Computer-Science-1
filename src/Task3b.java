import java.util.Scanner;

public class Task3b {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans = 1;

		// ---------------write your code BELOW this line only!--------------
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		for (int i = 0; i < n; i = i + 1) {
			ans = (ans * 2) % k; // We take the previous code (task3a) which gives us 2^n and divide it by k with
									// a remainder , as known as %=modulo , and insert % inside the loop to avoid
									// numbers over MV. We can do that because eventually , it
									// still represents (2^n) % k

		}
		// ---------------write your code ABOVE this line only!--------------

		System.out.println(ans);
		scanner.close();
	}
}