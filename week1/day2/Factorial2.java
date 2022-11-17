package week1.day2;

public class Factorial2 {

	public static void main(String[] args) {
		int number = 12;
		int count = 1;
		for (int i = number; i > 0; i--) {

			count = count * i;
		}
		System.out.println("factorial of 12 is  " + count);

	}

}