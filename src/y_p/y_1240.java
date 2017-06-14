package y_p;

import java.util.Scanner;

public class y_1240 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt(), i;
		// while (t-- > 0) {
		// int a = cin.nextInt(), b = cin.nextInt();
		// System.out.println(a + b);
		// }
		for (i = 1; i <= t; i++) {
			int a = cin.nextInt(), b = cin.nextInt();
			System.out.println(a + b);
		}
		cin.close();
	}
}
