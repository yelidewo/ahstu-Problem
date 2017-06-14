package y_p;

import java.util.Scanner;

public class y_1309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			if(a + b > c && a + c > b && b + c > a) {
				int s = (a + b +c) / 2;
				double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
				System.out.printf("%.2f", Area);
			}
			else{
				System.out.println("Input error!");
			}
			
		}
		cin.close();
	}

}
