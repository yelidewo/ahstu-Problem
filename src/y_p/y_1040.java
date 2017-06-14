package y_p;

import java.util.Scanner;

public class y_1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			long n = cin.nextLong();
			long i, sum = 0;
			for(i = 1; i <= n; i++)
				if(i % 2 == 1) {
					sum += i;
				}
			System.out.println(sum);
		}
		cin.close();
	}

}
