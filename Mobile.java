package week1.day1;

public class Mobile {
	
	private void makeCall() {
		String mobileModel = "vivo";
		float mobileWeight = 15.5f;	
		System.out.println(mobileModel);
        System.out.println(mobileWeight);
        System.out.println("Call Received");
	}
	private void sendMsg() {
		boolean isFullChatged = false;
		int mobileCost = 20000;
		System.out.println(isFullChatged);
        System.out.println(mobileCost);
        System.out.println("Message Reveived");

	}
public static void main(String[] args) {
	Mobile mb = new Mobile();
	mb.makeCall();
	mb.sendMsg();
}
}
