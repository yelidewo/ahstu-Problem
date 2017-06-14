package y_p;

import java.util.Scanner;

public class y_1201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			if(0 < m && m <= n && n< 10000) {
				int i, sum = 0;
				for(i = m; i <= n; i++) {
					if(i % 3 == 0 && i % 5 == 0) {
						sum++;
					}
				}System.out.println(sum);
			}
		}
		cin.close();
	}
}
