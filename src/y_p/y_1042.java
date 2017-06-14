package y_p;

import java.util.Scanner;

public class y_1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			double i, sum = 1;
			int x = cin.nextInt();
			for(i = 1; i <= x; i++) {
				sum = i * sum;
			}
			System.out.println((int)sum);
		}
		cin.close();
	}

}
