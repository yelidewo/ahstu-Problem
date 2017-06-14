package y_p;



import java.util.Scanner;

public class P1030 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			for (int i = 1; i <= n; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
		cin.close();
	}

	private static boolean isPrime(int n) {
		if (n <= 1 || n % 2 == 0 && n != 2)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
