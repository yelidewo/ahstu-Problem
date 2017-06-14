package y_p;

import java.util.Scanner;

public class y_1278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int x = cin.nextInt();
			double sin = Math.sin(x / 180.0 * Math.PI);
			double cos = Math.cos(x / 180.0 * Math.PI);
			System.out.printf("%.3f ", sin);
			System.out.printf("%.3f\n", cos);
		}
		cin.close();
	}

}
