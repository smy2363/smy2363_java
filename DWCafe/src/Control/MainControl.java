package Control;

import java.util.TreeMap;

import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(20, "�ڵ�");
		tree.put(54, "���");
		tree.put(9, "����");
		tree.put(33, "����");
		tree.put(5, "�丶��");
		
		System.out.println(tree);
		
//		System.out.println("===  DW ī�� �ֹ� Ű����ũ   ===\n");
//		System.out.println("=== ȭ���� ��ġ���� ������ ===\n");
//		Kiosk kiosk = new SelectDrink();
//		kiosk.action();

	}

}
