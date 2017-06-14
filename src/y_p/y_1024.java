package y_p;

import java.util.Scanner;

public class y_1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			long n = cin.nextLong();
			long i, j, sum = 0;
			for(i = 1; i <= n; i++) {
				long y = 1;
				for(j = 1; j <= i; j++) {
					y = y * j;
				}
				sum = sum + y;
			}
			System.out.println(sum);
		}
		cin.close();
	}

}
