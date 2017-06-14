package y_p;

import java.util.Scanner;

public class y_1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int x = cin.nextInt();
			if(0 <= x && x <= 2000) {
				for(int i = 2; i <= x / 2; i++) {
					if(x % i == 0) {
						break;
					}
						System.out.println("0");
					if(i > x / 2) {
						System.out.println("1");
					}
//					else {
//						System.out.println("1");
//					}
				} 
			}
		}
		cin.close();
	}

}
