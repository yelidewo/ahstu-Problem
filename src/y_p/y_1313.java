package y_p;

import java.util.Scanner;

public class y_1313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int n = cin.nextInt();
			for(int i = 1; i <= n; i++) {
					if(i % 7 == 0) {
						System.out.println(i);
					}
//					else if(i / 10 % 7 == 0 || i / ) {
//						
//					}
			}
		}
		cin.close();
	}

}
