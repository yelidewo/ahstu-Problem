package y_p;

import java.util.Scanner;

public class y_1272 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt();
			int a = x / 100;
			int b = (x / 10) % 10;
			int c = x % 10;
			if (c == 0) {
				System.out.println(b * 10 + a);
			} else {
				System.out.println(c * 100 + b * 10 + a);
			}
		}
		cin.close();
	}

}
