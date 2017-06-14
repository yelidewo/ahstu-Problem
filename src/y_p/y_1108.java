package y_p;

import java.util.Scanner;

public class y_1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
//			int x = cin.nextInt();
//			if(90 <= x && x <= 100) {
//				System.out.println("A");
//			}
//			else if (80 <= x && x < 90) {
//				System.out.println("B");
//			}
//			else if (70 <= x && x < 80) {
//				System.out.println("C");
//			}
//			else if (60 <= x && x < 70) {
//				System.out.println("D");
//			}
//			else if (0 <= x && x < 60) {
//				System.out.println("E");
//			}
//			else {
//				System.out.println("Score is error!");
//			}
			int x = cin.nextInt();
			int n = x / 10;
			switch (n) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("E");
				break;
			default:
				System.out.println("Score is error!");
				break;
			}
		}
		cin.close();
	}
}
