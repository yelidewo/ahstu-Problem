package y_p;

import java.util.Scanner;

public class y_1064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			double r = cin.nextDouble();
			double pi = Math.PI;
			double V = 4 / 3.0 * r * r * r * pi;
			System.out.printf("%.3f\n", V);
		}
		cin.close();
	}

}
