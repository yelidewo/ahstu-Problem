package y_p;

import java.math.BigInteger;
import java.util.Scanner;

public class y_1177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			long x = cin.nextLong();
			BigInteger sum = new BigInteger("1");
			for(int i = 2; i <= x; i++) {
				sum = sum.multiply(BigInteger.valueOf(i));
			}
			System.out.println(sum);
		}
		cin.close();
	}

}
