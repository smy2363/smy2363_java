package java_thread3;

public class Money {
	
	private int myMoney = 10000;
	public int getMyMoney() {
		return myMoney;
	}
	//widhdrow�޼��带 �Ӱ迵������ ���� (synchronized)
	public synchronized boolean widhdraw(int money) {
		if( myMoney >= money ) { // ���� �����ݾ� ���� ��ݱݾ��� �۰ų� ���ٸ� ���
			 try {
				Thread.sleep(1000);
			 }catch (Exception e) {}
			 
			 // ���
			 myMoney -= money;
			 return true;
		}
		return false; // ��ݽ���(������)
	}

}
