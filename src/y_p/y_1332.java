package y_p;

import java.util.Scanner;

public class y_1332 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(String.format("%03d", pow(a, b)));
		}
		cin.close();
	}

	private static int pow(int a, int b) {
		if (b == 0) return 1;
		if (a == 1) return 1;
		if (b % 2 == 0) return pow(a*a % 1000, b/2) % 1000;
		else return pow(a*a%1000, b/2)*a%1000;
	}

}
