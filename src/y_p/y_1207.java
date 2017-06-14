package y_p;

import java.util.Scanner;

public class y_1207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int x = cin.nextInt();
			int a, b, c, y;
			a = x / 100;
			b = x / 10 % 10;
			c = x % 10;
			y = a * a * a + b * b * b + c * c * c;
			if(x != 0) {
			if(y == x){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			}
		}
		cin.close();
	}

}
