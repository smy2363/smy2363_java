package java_thread1;

public class MainClass3 {

	public static void main(String[] args) {
		
		MeThread th1 = new MeThread(2000, "¿Ã√µ");
		MeThread th2 = new MeThread(3000, "ªÔ√µ");
		
		th1.start();
		th2.start();
		
		while(true) {
			System.out.print("");
			int num = MeThread.num;
			if(num ==15) {
				th1.stop();
				th2.stop();
				break;
			}
		}
		
	}

}
