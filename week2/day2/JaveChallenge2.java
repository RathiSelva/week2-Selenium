package week2.day2;

public class JaveChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2= ("luffy is still joyboy");
		String[] strArr =s2.split(" ");
		int size = strArr.length;
		int lastWord = strArr[size-1].length();
		System.out.println(lastWord);

	}

}
