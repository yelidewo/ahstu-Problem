package y_p;

import java.util.Scanner;

public class y_1274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
			int x = 0;
			if (b < a) {
				x = a;
				a = b;
				b = x;
			}
			if (c < a) {
				x = a;
				a = c;
				c = x;
			}
			if (c < b) {
				x = b;
				b = c;
				c = x;
			}
			System.out.printf("%d %d %d", a, b, c);
			// System.out.println(a);
			// System.out.println(b);
			// System.out.println(c);
		}
		cin.close();
	}

}
