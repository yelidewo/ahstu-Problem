package y_p;

import java.util.Scanner;

public class y_1275 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			int z = cin.nextInt();
			double c = (x + y + z) / 3.0;
			System.out.printf("%.3f", c);
		}
		cin.close();
	}

}
