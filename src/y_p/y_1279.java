package y_p;

import java.util.Scanner;

public class y_1279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			double x1 = cin.nextDouble();
			double y1 = cin.nextDouble();
			double x2 = cin.nextDouble();
			double y2 = cin.nextDouble();
			double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			System.out.printf("%.3f", d);
		}
		cin.close();
	}

}
