package homeProduct;

public class Aircon extends House {
	
	static final String[] windText= {"��","��","��"};
	
	
	int wind=0; //�ٶ�����
	int temperature;
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand, price);
	}
	
	void tempUp() {
		this.temperature++;
	}
	
	void tempDown() {
		this.temperature++;
	}
	
	void windControl() {
		wind++;
		if(wind==windText.length) wind=0;
		System.out.println("���� �ٶ����� : "+ windText[wind]);
	}
	
	
	@Override
	protected void power() {
		super.onOff = !super.onOff;
		System.out.println("������ ���� : " + super.onOff);
	}
	
}
