package java0704;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		

		// ��ǻ�Ϳ� ���������� �ϱ�
		// ��ǻ���� ���������� ���� comInput �޼��带 ����Ѵ�.
		// ������ ������������ �ѱ۷� �Է��Ѵ�.
		// ��, ��, �� �� ���� ����Ѵ�.
		// �޼��� - ���� ���������� �Է��ϰ� �����ϴ� �޼���
		//		- ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		// Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		// main �޼��忡���� Game Ŭ���� ��ü�� �޼���鸸 ����
		Game game = new Game();
		game.userInput();
		game.comInput();
		game.result();
		game.play();
	}

}

class Game{		// rock-paper-scissors ����
	Scanner sc = new Scanner(System.in);
	String com;		// ��ǻ�� ����������
	String user;	// ���� ����������
	
	void play() {
		comInput();
		userInput();
		result();
	}
	void comInput() {
		int temp = (int)(Math.random()*3);
		switch(temp) {
		case 0 : this.com = "����"; break;
		case 1 : this.com = "����"; break;
		case 2 : this.com = "��"; break;
		
		}
	}
	
	void userInput() {
		System.out.println("���� ���� �� �Է�: ");
		this.user = sc.nextLine();
		
	}
	void result() {
		if(user.equals(com)) {
			System.out.println("���");
		}else if((user.equals("����"))&&(com.equals("��")) ||
				(user.equals("����"))&&(com.equals("����")) ||
				(user.equals("��"))&&(com.equals("����"))) {
			System.out.println(" ���� ��, ��ǻ�� �� ");
		}else {
			System.out.println(" ���� ��, ��ǻ�� �� ");
		}
	}
}