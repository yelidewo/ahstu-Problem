package y_p;

import java.util.Scanner;

public class y_1282 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			float x = cin.nextFloat();
			// System.out.printf("%.2f", Math.abs(x));
			if (x < 0) {
				float i = -x;
				System.out.printf("%.2f", i);
			} else {
				System.out.printf("%.2f", x);
			}
		}
		cin.close();
	}
}
