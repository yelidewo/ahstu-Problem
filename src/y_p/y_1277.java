package y_p;

import java.util.Scanner;

public class y_1277 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt();
			int sum = 0, i;
			for (i = 0; i <= x; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
		cin.close();
	}
}
