package y_p;

import java.util.Scanner;

public class y_1291 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if(a < 100 ) {
				a = 100;
			}
			if(b > 999){
				b = 999;
			}
			int i = 0, x, y, z;
			for(i = a; i <= b; i++) {
				x = i / 100;
				y = i / 10 % 10;
				z = i % 10;
				if(i == x * x * x + y * y * y + z * z * z) {
					System.out.println(i);
				}
			}
		}
		cin.close();
	}

}
