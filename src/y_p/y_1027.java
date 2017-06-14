package y_p;

public class y_1027 {

	public static void main(String[] args) {
		for(int i = 1000; i <= 9999; i++){
			int a = 0, b = 0, sum = 0;
			a = i / 100;
			b = i % 100;
			sum = (a+b)*(a+b);
			if(sum == i){
				System.out.println(i);
			}
		}
	}

}
