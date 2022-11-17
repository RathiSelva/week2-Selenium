package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "LOSHINI SHRI";
		int totalNoOfString = s.length();
		int totalNoOfString_afterRemovingILetter = s.replace("I","").length();
		
		 int count= totalNoOfString - totalNoOfString_afterRemovingILetter;
		 
		 System.out.println("Total no of I letters in 'LOSHINI SHRI' is " + count);
		
		
	}

}
