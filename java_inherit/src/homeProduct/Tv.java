package homeProduct;

public class Tv extends House {
	
	int channel=10;; // ä��
	int vol=5; // �Ҹ�

	Tv(){ // ������ �޼���
		super();
	}
	// �Ű����� �ִ� ������ �޼���
	Tv(String brand, int price){
		super(brand, price); // �θ�Ŭ���� �����ڸ޼��� ȣ��
	}
	
	void channel1Up() {
		channel++;
	}
	
	void channel1Down() {
		channel--;
	}
}
