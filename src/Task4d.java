import java.util.Scanner;

public class Task4d {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans1 = 0;
		int ans2 = 0;

		// ---------------write your code BELOW this line only!--------------
		int n = scanner.nextInt();
		int s = 0;                      // Starting the count for 2^s from 0
		n = n - 1;                      // Setting the n we check inside the loop to be n-1
		while (n % 2 == 0) {            // Using While to count every time we can divide our given number by 2 without a remainder.
			
			s = s + 1;                  //When we can't divide the current "n" by 2 without a remainder - this is our "d"
			n = (n / 2);
		}
		ans1 = s;
		ans2 = n;
		// ---------------write your code ABOVE this line only!--------------

		System.out.println(ans1);
		System.out.println(ans2);
		scanner.close();
	}
}