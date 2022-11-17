package week1.day1;

public class Mobile {

   public static void main(String[] args) {
		
      Mobile shinefine = new Mobile();
      shinefine.makeCall();
      shinefine.sendMsg();
	}
  public void makeCall() {
	   System.out.println("Making call now");
  }

   public void sendMsg() {
	   System.out.println("send sms");
   
   }   
}
