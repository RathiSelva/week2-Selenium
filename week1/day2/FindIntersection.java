package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr1[] = {1,3,5,7,9};
 int arr2[] = {1,5,9,11,13};
 
 for (int i = 0; i < arr1.length; i++) {
	 for (int j = 0; j < arr2.length; j++) {
		 if (arr1[i] == arr2[j]) {
		System.out.println(arr2[j]);
	}
	
	 }
	
 }}}

