package week1.day2;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 6 };
		int sum = 0;
		int sum1 = 0;
		int A;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}

		// {System.out.println(sum); }

		int corarr[] = { 1, 2, 3, 4, 5, 6 };
		for (int j = 0; j < corarr.length; j++) {
			sum1 = sum1 + corarr[j];
		}

		// {System.out.println(sum1);}

		A = sum1 - sum;
		System.out.println(A);
	}

}
