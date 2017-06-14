package y_p;

import java.util.Scanner;

public class y_1283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
//			if(a + b > c && a + c > b && b + c >a) {
//				if(a * a + b * b == c * c || a * a + c * c == b * b || b*b + c*c ==a*a) {
//					System.out.println("yes");
//				}
//				else {
//					System.out.println("no");
//				}
//			}
//			else {
//				System.out.println("not a triangle");
//			}
			System.out.println(a+b>c&&a+c>b&&b+c>a?(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a?"yes":"no"):"not a triangle");
		}
		cin.close();
	}

}
