package homeProduct;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Tv tv=new Tv();
		tv.brand="�Ｚ";
		tv.power();
		tv.power();
		
		Aircon air=new Aircon();
		air.brand="LG�ּ�";
		System.out.println(air.brand);
		air.power();
		air.power();
		
		
		
		
	}

}

// Ŭ���� ���
// ��� �Ϸ��� �ڽ�Ŭ�����̸� �ڿ� extends �θ�Ŭ�����̸�
// extends - Ȯ��, ����...
// Tv extends House -> TvŬ������ �ڽ�Ŭ�����̰� House�� �θ�Ŭ�����̴�.
// ����� �ϴ� ����ū ����- ������
// �θ�Ŭ������ �ν��Ͻ�����, �ν��Ͻ��޼���, Ŭ��������, 
//			Ŭ�����޼��� ��밡���ϴ�.
// ��, �θ�Ŭ������ ���� ��������� ���Ѵ�.
// ����ɷ��ִ� ������ �޼���� ���Ұ�

