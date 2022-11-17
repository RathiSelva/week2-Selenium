package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int A[] = { 1, 6, 4, 3, 8, 10 };

		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i] + 1) {
				continue;

			} else {
				for (int j = A[i] + 1; j < A[i + 1]; j++) {
					System.out.println(j);

				}

			}
		}
	}
}