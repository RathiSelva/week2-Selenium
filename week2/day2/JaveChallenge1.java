package week2.day2;

public class JaveChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "fly me to the moon";
		String[] stAr = s1.split(" ");
		int size = stAr.length;
		int lastWord = stAr[size-1].length();
		System.out.println(lastWord);
	}

}
