package y_p;

import java.util.Scanner;

public class y_1280 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt();
			if (x % 2 != 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
		cin.close();

	}

}
