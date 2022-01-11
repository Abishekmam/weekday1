package week1.day1;

public class Mobile {
	String mobilemodel;
	int mobileweight;
	boolean Fullcharge;
	double mobilecost;

	public void makeCall() {

		System.out.println("make call");
	}

	public void sendmessage() {
		System.out.println("send message");
	}

	public static void main(String[] args) {
		Mobile nokia = new Mobile();
		nokia.makeCall();
		nokia.sendmessage();
		System.out.println(nokia.mobilemodel);
		System.out.println(nokia.mobileweight);
		System.out.println(nokia.Fullcharge);
		System.out.println(nokia.mobilecost);
	}

}
