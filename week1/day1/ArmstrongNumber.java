package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 153;
		int sum = 0;
		int s = input;
		while (input > 0) {
			int rem = input % 10;

			input = input / 10;

			sum = sum + (rem * rem * rem);}
		//	System.out.println(sum);
		

		if (s == sum)
			{System.out.println(sum + " is an Armstrong number");}
		else
			{System.out.println(sum + " is not an Armstrong Number");}
	}
}
