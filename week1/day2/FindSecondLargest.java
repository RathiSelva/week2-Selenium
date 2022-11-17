package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 11, 4, 6, 7 };
		/*
		 * System.out.println(data[0]);
		 * 
		 * int noOfData = data.length;
		 * 
		 *  System.out.println(noOfData);*/
		 
		for (int i = 0; i < data.length; i++) {

			Arrays.sort(data);
			//System.out.println(data[i]);
		}

		System.out.println( "The Second Largest in this Array is " +data[data.length - 2]);

	}

}
