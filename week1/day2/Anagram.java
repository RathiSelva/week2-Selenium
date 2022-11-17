package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "NARENJI";
		String y = "NERANIJ";
		char[] A = x.toCharArray();
		char[] B = y.toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		boolean equals = Arrays.equals(A, B);

		if (equals == true) {
			System.out.println("Strings x and y are Anagram");
		} else {
			System.out.println("Strings x and y are not Anagram");
		}
	}
}
