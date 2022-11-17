package week1.day2;
import java.util.Arrays;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "race car";
		String reverse = "";
		for (int i = original.length() - 1; i < 0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);

			boolean palindrome = true;
			for (int j = 0; j < original.length(); j++) {
				if (reverse == original) {
					System.out.println(original + "  is a Palindrome");
				} else {
					System.out.println(original + " is not a Palindrome");
				}

			}
		}

	}
}
