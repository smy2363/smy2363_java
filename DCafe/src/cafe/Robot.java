package cafe;

public class Robot implements Runnable{
	private Drink drink; // 서빙할 음료
	private int tableNumber; // 서빙할 테이블번호
	
	//음료를 운반하는 메서드(음료와 테이블 번호를 받아서 쓰레드를 시작함)
	public void serving(Drink drink, int tableNumber) {
		this.drink=drink; // 서빙할 음료
		this.tableNumber=tableNumber; //서빙할 테이블번호
		new Thread(this).start(); //새로운 스레드를 시작하여 run메서드를 시랳ㅇ
	}
	
	// 스레드가 시작되면 실행되는 메서드
	@Override
	public void run() {
		System.out.println("로봇이 음료를 담았다 "+drink.getName());
		
	try {
		Thread.sleep(3000); //음료를 서빙하는시간(3초대기)
		
		}catch(InterruptedException e){
		e.printStackTrace();
		}
		servingDrink(); //음료를 서빙하는 메서드를 호출
	}

	public void servingDrink() {
		System.out.println("로봇이 서빙을 합니다"+drink.getName()+"테이블"+tableNumber);
		try {
			Thread.sleep(3000);; //음료 서빙시간 (3초대기)
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("음료를 서빙완료 했습니다"+tableNumber);
	}
}
