package homeProduct;

public abstract class House{
	
	protected boolean onOff;
	protected String brand; //��ǰ �귣��
	protected int price; //��ǰ ���Ű���
	
	protected House(){
		this.onOff=false;
	}
	
	protected House(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	
	protected abstract void power(); // �߻� �޼���


}

// �߻�Ŭ���� - class �տ� abstract�� ���δ�.
// �߻�Ŭ������ ��ü �����Ұ�
// �߻�޼��带 ������ �ִ� Ŭ������ �ݵ�� �߻�Ŭ������ �Ǿ���Ѵ�.
// �θ�Ŭ������ �߻�Ŭ������� �ݵ�� �ڽ�Ŭ������ �߻�޼��带
// �����ؾ��Ѵ�.
// �θ��� �߻�޼��带 ������ ���� �����Ŷ�� �ڽ�Ŭ������ �߻�Ŭ������ 
// �Ǿ�� �Ѵ�.
