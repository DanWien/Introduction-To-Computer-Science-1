import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans = 0;

		// ---------------write your code BELOW this line only!--------------
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (b >= a & a > 0) {
			ans = (int) (Math.random() * (b - a + 1) + a); // Since math random gives us a number between 0 and 1,
															// without 1 - meaning the max number is 0.999 , We multiply
															// it by (b-a) and add 1 so the casting from double to
															// integer gives us exactly b ,Then we add a so ans ranges
															// exactly between a to b
		}
		if (b >= a & a < 0) {
			ans = (int) (Math.random() * (b - a + 1) + a - 1); // For negative values , for example we take -10 , -8 :If
																// we do the math we get (-8 - (-10)+1 = 3 -10 = -7. If
																// we receive -7.5 I think integer makes it -7 and we
																// don't want that value , so I subtracted one.

		}
		// ---------------write your code ABOVE this line only!--------------
		System.out.println(ans);
		scanner.close();
	}
}