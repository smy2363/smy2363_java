package homeProduct;

public class Tv extends House {
	
	int channel=10;; // ä��
	private int vol=5; // �Ҹ�
	
	

	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public Tv(){ // ������ �޼���
		super();
	}
	// �Ű����� �ִ� ������ �޼���
	public Tv(String brand, int price){
		super(brand, price); // �θ�Ŭ���� �����ڸ޼��� ȣ��
	}
	
	public void channel1Up() {
		channel++;
	}
	
	public void channel1Down() {
		channel--;
	}
	
	@Override
	public void power() {
		super.onOff = !super.onOff;
		System.out.println("TV ����: "+super.onOff);
	}
	

}
	
// �����ε��� - ���ο� �޼��带 �����ϴ°�
// �������̵��� - ������ �޼��带 ������ �ϴ°�
	
	
	
	
// �������̵� ����
// �θ�Ŭ������ �ش� �޼��尡 �����ؾ��Ѵ�.
// �������̵� �޼���� �ݵ�� ��ȯŸ��, �޼��� �̸�, �Ű����� ��� ��ġ
// �ۼ��ؾ��Ѵ�.
// �޼����� {  } ������ �޶� �ȴ�.

	

