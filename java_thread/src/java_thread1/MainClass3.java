package java_thread1;

public class MainClass3 {

	public static void main(String[] args) {
		
		MeThread th1 = new MeThread(2000, "��õ");
		MeThread th2 = new MeThread(3000, "��õ");
		
		// ���������� ������ ���� join();
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		

		
	}

}
