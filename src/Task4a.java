import java.util.Scanner;

public class Task4a {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean ans = true;

		// ---------------write your code BELOW this line only!--------------
		int n = scanner.nextInt();
		for (int i = 2; i * i <= n; i = i + 1) { // Starting i from i=2 means if we set n to be 2 or 3 , when we get to
													// the condition i*i <= n we already Leave the loop and ans remains
													// true , meaning 2 and 3 are indeed Prime numbers
			if (n % i == 0) { // For the rest of the Values , for example 11 - we check the dividers up to the
								// root of the number , so for 11 it checks 2, And there is a remainder from n%i
								// , i goes up to 3 , same thing happens and then 4*4>11 , we exit the loop and
								// print that 11 is indeed a prime number.
				ans = false;
			} 
		} 
			// ---------------write your code ABOVE this line only!--------------

		System.out.println(ans);
		scanner.close();
	}
}