package y_p;

import java.util.Scanner;

public class y_1030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt();
			int i, j;
			int first = 0;
			for (j = 2; j <= x; j++) {
				for (i = 2; i <= j / 2; i++) {
					if (j % i == 0) {
						break;
					}
				}
				if (i > j / 2) {
					if (first == 1)
						System.out.print(" ");
					first = 1;
					System.out.print(j);
				}
			}
			System.out.println(" ");
		}
		cin.close();
	}
}
