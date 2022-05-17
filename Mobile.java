package week1.day1;

public class Mobile {
			
	public void makeCall()
	{
		System.out.println("call to friend");
	}
	public void sendMsg()
	{
      	System.out.println("sending message");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Mobile myMobile = new Mobile();
            myMobile.makeCall();
            myMobile.sendMsg();
	}

}
