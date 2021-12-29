package week1.day1;

public class Mobile {
	String mobileModel = "Mi Note5";
	int tmobileWeight = 50;
	boolean isFullCharge = true;
	double mobileCost = 15000.50;
private void makeCall() {
System.out.println("please makeCall");

}
private void sendMsg() {
System.out.println("please SendMSG");

}
public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
System.out.println(myMobile.mobileModel);
System.out.println(myMobile.tmobileWeight);
System.out.println(myMobile.isFullCharge);
System.out.println(myMobile.mobileCost);
}
}
