import java.util.Scanner;

public class Task4e {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean ans1 = false; // we set ans1 as false because of the method I chose to solve this
		int ans2 = 0;

		// ---------------write your code BELOW this line only!--------------
		int n = scanner.nextInt();
		int b = scanner.nextInt();
		int s = scanner.nextInt();
		int d = scanner.nextInt();
		ans2 = b; // Setting ans2 to be b , so in case both terms are met we print ans2 as b
		b = 1; // Setting b=1 because b^0 is always 1

		for (int i = 0; i < d; i = i + 1) {
			b = b * ans2 % n; // Calculating b^d % n because if scanner receives large numbers we will go over
								// MV
		}
		if (b == 1) {                        // We have set ans1 to be false , and if the first condition isn't met , we
						                       	 // already set ans1=true and in the rest of the code we have no way of setting
							                     // it back to be false,
			ans1 = true;                         // Therefore if the first condition is not met we will print the requested
							                     // values. (if b^d == 1 , it means it is prime , because only a non-prime number will meet both conditions.) 
			ans2 = -1;
		}
		for (int i = 0; i <= s - 1; i = i + 1) {                      // Calculating i
			int exp = 1;                                              // Setting "exp" as our exponent and calculating 2^i so we can multiply b
							                                          // (2^i)*d times
			for (int j = 0; j < i; j = j + 1) {
				exp = 2 * exp;
			}
			b = 1;
			for (int j = 0; j < exp * d; j = j + 1) {   // Here we are using our exp (exp=2^i) , multiply it by d and we
														// once again keep % inside the loop cause we don't want to go
														// over MV.
				b = b * ans2 % n;
			}
			if (b == n - 1) {                  // In case the first term was met , we make sure that the second term is met as
								               // well and if it isn't , we set ans1=true , ans2=-1.
				ans1 = true;
				ans2 = -1;
			}
		}

		// ---------------write your code ABOVE this line only!--------------

		System.out.println(ans1);
		System.out.println(ans2);
		scanner.close();
	}
}