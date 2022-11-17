package week2.day2;

import java.util.Iterator;

import net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice;

public class JavaChallenge {

	public static void main(String[] args) {
		String s = "Hello World God bless u";
		String[] stAr = s.split(" ");
		//int size = stAr.length;
		System.out.println(stAr.length);
		int lastWord = stAr[stAr.length - 1].length();
		System.out.println(lastWord);

		char chAt = s.charAt(s.length() - 1);
		System.out.println(chAt);

		int len = s.length();
		System.out.println(len);
		
		int indexOf = s.indexOf('H');
		System.out.println(indexOf);
		
		int indexOf2 = s.indexOf('l');
		
 
		 
			{System.out.println(indexOf2);}
			
		for (int j=0;j<stAr.length;j++){
			System.out.println(stAr[j]);}
	}		
	}

		
		 
			
		
			
		
		

		
	

	


