import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean ans = true;

		// ---------------write your code BELOW this line only!--------------
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int q = scanner.nextInt();
		int r = scanner.nextInt();
		if (r < b & a == q * b + r & b != 0) { // Stating the conditions , then if our values fit them , print true.

			ans = true;
		} else { // Else - print false.
			ans = false;
		}

		// ---------------write your code ABOVE this line only!--------------

		System.out.println(ans);
		scanner.close();
	}
}