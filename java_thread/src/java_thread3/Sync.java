package java_thread3;

public class Sync {

	public static void main(String[] args) {
		
		BankTh thread = new BankTh();
		
		Thread th1 = new Thread(thread);
		Thread th2 = new Thread(thread);
		
		th1.setName("�ڹ���  ");
		th2.setName("  �̼���");
		
		th1.start();
		th2.start();
	}

}
