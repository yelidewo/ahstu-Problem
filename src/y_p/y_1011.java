package y_p;

public class y_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, a, b, c;
		for(i = 100; i < 1000; i++) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if(a * a * a + b * b * b + c *c * c == i) {
				System.out.println(i);
			}
		}
	}
}
