package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;

		int count = 10;

		for (int i = 0; i <= 1; i++) {

			System.out.println(i);
		}

		for (int i = 2; i <= 10; i++) {
			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
}