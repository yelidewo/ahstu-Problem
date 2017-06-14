package y_p;

import java.util.Scanner;

public class y_1199 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if(a !=0 && b != 0){
				int sum = 0;
				sum = a + b;
				System.out.println(sum);
			}
			else {
				break;
			}
		}
		cin.close();
	}

}
