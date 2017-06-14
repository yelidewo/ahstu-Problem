package y_p;

import java.util.Scanner;

public class y_1271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			double r = cin.nextFloat();
			double h = cin.nextFloat();
			double pi  = Math.PI;
			double Area = (float)(r*r*pi)*2 + 2*pi*r*h;
			System.out.printf("Area=%.3f", Area);
		}
		cin.close();
	}
}
