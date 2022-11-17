package week1.day1;

public class Phone {
	
	 String mobileBrandName ="i phone";
	 char mobileLogo = 'I';
	 short noOfMobilePiece = 140;
	 int modelNumber = 71000;
	 long mobileImeiNumber = 2403400L;
	 float mobilePrice = 82350.99F;
	 boolean isDamaged = false;
	 
	public static void main(String[] args) {  
		
		Phone mobile = new Phone();
		mobile.iPhone();
	}
	public void iPhone()	{

	System.out.println(mobileBrandName);
	System.out.println(mobileLogo);
	System.out.println(noOfMobilePiece);
	System.out.println(modelNumber);
	System.out.println(mobileImeiNumber);
	System.out.println(mobilePrice);
	System.out.println(isDamaged);
}
}
