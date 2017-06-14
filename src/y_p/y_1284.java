package y_p;

import java.util.Scanner;

public class y_1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt();
			if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		cin.close();
	}

}
