package java_thread1;

public class MeThread extends Thread{
	
	public static int num=10; // Ŭ���� ����
	
	private int time; // sleep�� ������ �ð�
	public MeThread(int time, String name) {
		super(name);
		this.time = time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(true) {
			System.out.println("������� : "+ name +" ����num :" + num);
			
			num++;
			if(num == 15) break;
			
			try {
				Thread.sleep(time);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
