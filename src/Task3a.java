import java.util.Scanner;

public class Task3a {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans = 1;

		// ---------------write your code BELOW this line only!--------------
		int n = scanner.nextInt();
		for (int i = 0; i < n; i = i + 1) { // For n=0 , i=n , therefore it exits the loop and prints the variable ans
											// as we have set it to be 1 (because 2^0 = 1). When we set n=1 , the loop occurs one time
											// before it leaves it and prints "2" as 1*2=2 , and for each i>1 It keeps
											// multiplying it.

			ans = ans * 2;
			//
		} //
			// ---------------write your code ABOVE this line only!--------------
		System.out.println(ans);
		scanner.close();
	}
}