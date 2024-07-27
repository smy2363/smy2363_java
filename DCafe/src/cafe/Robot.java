package cafe;

public class Robot implements Runnable{
	private Drink drink; // ������ ����
	private int tableNumber; // ������ ���̺��ȣ
	
	//���Ḧ ����ϴ� �޼���(����� ���̺� ��ȣ�� �޾Ƽ� �����带 ������)
	public void serving(Drink drink, int tableNumber) {
		this.drink=drink; // ������ ����
		this.tableNumber=tableNumber; //������ ���̺��ȣ
		new Thread(this).start(); //���ο� �����带 �����Ͽ� run�޼��带 �ÎO��
	}
	
	// �����尡 ���۵Ǹ� ����Ǵ� �޼���
	@Override
	public void run() {
		System.out.println("�κ��� ���Ḧ ��Ҵ� "+drink.getName());
		
	try {
		Thread.sleep(3000); //���Ḧ �����ϴ½ð�(3�ʴ��)
		
		}catch(InterruptedException e){
		e.printStackTrace();
		}
		servingDrink(); //���Ḧ �����ϴ� �޼��带 ȣ��
	}

	public void servingDrink() {
		System.out.println("�κ��� ������ �մϴ�"+drink.getName()+"���̺�"+tableNumber);
		try {
			Thread.sleep(3000);; //���� �����ð� (3�ʴ��)
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("���Ḧ �����Ϸ� �߽��ϴ�"+tableNumber);
	}
}
