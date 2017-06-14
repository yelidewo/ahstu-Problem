package y_p;

import java.util.Scanner;

public class y_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a, b, c;
			int x = cin.nextInt();
			a = x / 100;
			b = x / 10 % 10;
			c = x % 10;
			// System.out.println(a*a*a+b*b*b+c*c*c);
			if (x == a * a * a + b * b * b + c * c * c) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		cin.close();
	}

}
