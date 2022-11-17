package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {

	public int mul(int a, int num1) {
		int result = a * num1;

		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// to convert negative number to positive number -ve number has to be multiplied
		// by -1
		ConvertANegativeNumberToPositiveNumber cnp = new ConvertANegativeNumberToPositiveNumber();
		int mul = cnp.mul(-20, -1);
	}

}
