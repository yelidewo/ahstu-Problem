package y_p;

import java.util.Scanner;

public class y_1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
		while (n-- > 0) {
			int x = cin.nextInt();
			int y = cin.nextInt();
				int sum = x + y;
				if (sum > 100) {
					System.out.println(sum % 100);
				} 
				else {
					System.out.println(sum);
				}
			}
		}
		cin.close();
	}

}
