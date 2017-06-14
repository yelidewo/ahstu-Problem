package y_p;

import java.util.Scanner;

public class y_1276 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			float f = cin.nextFloat();
			float c = 5 * (f - 32) / 9;
			System.out.printf("%.3f", c);
		}
		cin.close();
	}

}
