package java_thread4;

import java.lang.Thread.State;

public class TreadState {
	
	private static Thread thread;
	private static Thread stateThread;

	public static void main(String[] args) {
		stateThread = new Thread(()->{ // �͸� Ŭ���� ��ü ����
			while(true) {
				State state = thread.getState();
				System.out.println(thread.getName()+
						" -������... ���� : "+state);
				if(state == State.NEW) {
					System.out.println(" ������ ���� �غ� �ܰ� ");
					thread.start();
				}
				
				if( state == State.WAITING) {
					System.out.println("������ ��� �ܰ�");
					thread.interrupt();
				}
				
				if( state == State.TERMINATED) {
					System.out.println(thread.getName() +
							" - ������... ���� : "+state);
					break; // terminated ���¶�� �����尡 ���� �� �����̴�.
				}
				
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread = new My(" ������1�� ", stateThread);
		stateThread.start();
		
		
	}

}
