package week1.day1;

public class TwoWheeler {
    public	int noOfWheels = 2;
    public	short noOfMirrors = 30;
    public	long chassisNumber = 50000L;
    public	boolean isPunchtured = false;
    public	String bikeName  = "Rocky";
    public	double runningKM = 510.86;	
	
public static void main(String[] args) {
	
	TwoWheeler hero=new TwoWheeler();
    hero.splendor();
}
public void splendor() {
	System.out.println(noOfWheels);
	System.out.println(noOfMirrors);
	System.out.println(chassisNumber);
	System.out.println(isPunchtured);
	System.out.println(bikeName);
	System.out.println(runningKM);

}
}
