package y_p;

import java.util.Scanner;

public class y_1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			double U = cin.nextDouble(),D = cin.nextDouble(), H = cin.nextDouble();
			if(0 < U && U < D && 0 < H) {
				double S, C;
				S = (U + D) * H / 2;
				C = (double) ((U + D) + 2 * Math.sqrt((D - U) * (D - U) / 4 +  H * H));
				System.out.printf("%.2f\n", S);
				System.out.printf("%.2f\n", C);
			}
		}
		cin.close();
	}

}
