package y_p;

import java.util.Scanner;

public class y_1273 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			int t;
			t = x;
			x = y;
			y = t;
			System.out.print(x + " " + y);
		}
		cin.close();
	}
}
