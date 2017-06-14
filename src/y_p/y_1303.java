package y_p;

import java.util.Scanner;

public class y_1303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			int m, n;
			m = (x % 10 + y % 10) % 10;
			n = (x / 10 + y / 10) % 10;
			System.out.println(m + n * 10);
		}
		cin.close();
	}

}
